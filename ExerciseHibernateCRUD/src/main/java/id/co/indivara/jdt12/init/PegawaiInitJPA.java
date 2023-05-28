package id.co.indivara.jdt12.init;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import id.co.indivara.jdt12.entity.Pegawai;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PegawaiInitJPA {

    public static Session initHibernate(Class namaClassEntity){
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        conf.addAnnotatedClass(namaClassEntity);
        SessionFactory sessFac = conf.buildSessionFactory();
        Session session = sessFac.openSession();

        return session;
    }

    public void createPegawai(Pegawai peg) throws Exception{
        Session session = initHibernate(Pegawai.class);

        session.beginTransaction();

        Pegawai emp = new Pegawai();
        emp.setNip(peg.getNip());
        emp.setNama(peg.getNama());
        emp.setEmail(peg.getEmail());
        emp.setPosisi(peg.getPosisi());
        session.save(emp);
        session.getTransaction().commit();
        session.clear();
    }

    public void createManyPegawai(ArrayList<Pegawai> p) throws Exception{
        for (Pegawai peg : p){
            createPegawai(peg);
        }
    }

    public void removePegawai(int nip) throws Exception {
        Session session = initHibernate(Pegawai.class);
        Pegawai peg = session.load(Pegawai.class, nip);
        session.beginTransaction();
        session.delete(peg);
        session.getTransaction().commit();
        System.out.println("==DATA BERHASIL DIDELETE===");
    }

    public void updatePegawai(Pegawai p) throws Exception{
        Session session = initHibernate(Pegawai.class);
        session.beginTransaction();
        Pegawai peg = new Pegawai();
        peg.setNip(p.getNip());
        peg.setNama(p.getNama());
        peg.setEmail(p.getEmail());
        peg.setPosisi(p.getPosisi());
        session.update(peg);
        session.getTransaction().commit();
    }

    public void showAllPegawai(String namaFile) throws Exception{
        Session session = initHibernate(Pegawai.class);
        List<Pegawai> pegList = session.createQuery("from Pegawai").list();
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter ow = mapper.writer(new DefaultPrettyPrinter());
        ow.writeValue(new File(namaFile),pegList);
        System.out.println("Semua Data Pegawai Disimpan di- " + namaFile);
        session.close();
    }

    public void showPegawaiById(int nip, String namaFile) throws Exception{
        Session session = initHibernate(Pegawai.class);
        Pegawai peg = session.load(Pegawai.class, nip);
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        ObjectWriter ow = mapper.writer(new DefaultPrettyPrinter());
        ow.writeValue(new File(namaFile),peg);
        System.out.println("Data dengan NIP tersebut Disimpan di- " + namaFile);
        session.close();
    }

}

import id.co.indivara.jdt12.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DemoHibernate {

    public static Session initHibernate(Class namaEntityClass){
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Employee.class);
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        return session;
    }

    public static void main(String[] args) {

        //Load File Konfigurasi
//        Configuration config = new Configuration();
//        config.configure("hibernate.cfg.xml");

        //Lakukan mapping entity ke Hibernate
//        config.addAnnotatedClass(Employee.class);

        //Buat session / connection ke Hibernate
//        SessionFactory sf = config.buildSessionFactory();
//        Session session = sf.openSession();

        //Siapkan Data yang akan diinsert ke table
//        Employee andi = new Employee();
//        andi.setEmployeeId(100);
//        andi.setFirstName("Andi");
//        andi.setSalary(1000);

        Session session = initHibernate(Employee.class);
        Scanner scan = new Scanner(System.in);

        while (true){
                System.out.println("=======INPUT========");
                System.out.print("NIP: ");
                int nip = Integer.parseInt(scan.nextLine());
                System.out.print("NAMA: ");
                String nama = scan.nextLine();
                System.out.print("GAJI: ");
                double gaji = Double.parseDouble(scan.nextLine());

                Employee tambah = new Employee();
                tambah.setEmployeeId(nip);
                tambah.setFirstName(nama);
                tambah.setSalary(gaji);

                //Lakukan operasi yg diinginkan ke table
                session.beginTransaction();
                session.save(tambah);
                session.getTransaction().commit();
                session.clear();
                System.out.println("Insert Success!");

                while (true){
                    System.out.print("Lagi: ");
                    String lagi = scan.nextLine().toLowerCase();
                    if (!lagi.equals("y") && !lagi.equals("t")){
                        continue;
                    } else if (lagi.equals("y")) {
                        break;
                    } else if (lagi.equals("t")) {
                        System.exit(0);
                    }
                }
            }

    }
}

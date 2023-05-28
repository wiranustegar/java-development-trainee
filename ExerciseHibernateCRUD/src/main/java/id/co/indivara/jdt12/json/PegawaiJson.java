package id.co.indivara.jdt12.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import id.co.indivara.jdt12.entity.Pegawai;
import id.co.indivara.jdt12.init.PegawaiInitJPA;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PegawaiJson {

    private PegawaiInitJPA init;
    public PegawaiJson (PegawaiInitJPA init){
        this.init = init;
    }

    public void createPegawaiJson(String namaFileJson) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        Pegawai peg = mapper.readValue(new File(namaFileJson), Pegawai.class);
        init.createPegawai(peg);
        System.out.println("=====DATA EMPLOYEE BERHASIL DIINSERT=====");
    }


    public void createManyPegawaiJson(String namaFileArrayJson) throws Exception{

        ObjectMapper mapper = new ObjectMapper();
        List<Pegawai> pegList = mapper.readValue(new File(namaFileArrayJson),
                new TypeReference<List<Pegawai>>() {
        });
        init.createManyPegawai((ArrayList<Pegawai>) pegList);
        System.out.println("===DATA EMPLOYEE BERHASIL DICREATE===");

    }

    public void updatePegawaiJson(String namaFileJson) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Pegawai peg = mapper.readValue(new File(namaFileJson), Pegawai.class);
        init.updatePegawai(peg);
        System.out.println("===DATA BERHASIL DIUPDATE===");

    }
}

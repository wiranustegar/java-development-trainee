package id.co.indivara.jdt12.api.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import id.co.indivara.jdt12.api.entity.Employee;

import java.io.File;

public class JsonObjectWriter {
    public void writeJsonToFile(Employee emp, String namaFile) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(namaFile),emp);
        System.out.println("Penulisan Sukses");
    }
}

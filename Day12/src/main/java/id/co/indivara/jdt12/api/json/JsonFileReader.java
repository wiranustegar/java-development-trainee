package id.co.indivara.jdt12.api.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import id.co.indivara.jdt12.api.entity.Employee;

import java.io.File;

public class JsonFileReader {
    public void readJsonFileToObject(String namaFile) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Employee emp = mapper.readValue(new File(namaFile), Employee.class);
        System.out.println("NIP: " + emp.getEmployeeId());
        System.out.println("NAMA: " + emp.getFirstName());
        System.out.println("GAJI: " + emp.getSalary());
        System.out.println("====================");
    }
}

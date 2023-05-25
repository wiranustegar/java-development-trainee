package id.co.indivara.jdt12.api.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import id.co.indivara.jdt12.api.entity.Employee;

import java.io.File;
import java.util.List;

public class JsonArrayReader {
    public void readJsonArrayFromFile(String namaFile) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<Employee> empList = mapper.readValue(new File(namaFile),new TypeReference<List<Employee>>() {});

        for (Employee e : empList){
            System.out.println(e);
            System.out.println("---------");
        }
    }
}

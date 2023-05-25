package id.co.indivara.jdt12.api.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import id.co.indivara.jdt12.api.entity.Employee;

public class StringToJsonConverter {
    public void stringToJson(String jsonString) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        Employee emp = mapper.readValue(jsonString, Employee.class);
        System.out.println(emp);
    }
}

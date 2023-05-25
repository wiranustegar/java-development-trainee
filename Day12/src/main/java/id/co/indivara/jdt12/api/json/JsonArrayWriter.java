package id.co.indivara.jdt12.api.json;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import id.co.indivara.jdt12.api.entity.Employee;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;

public class JsonArrayWriter {
    public void writeListToJsonArray(ArrayList<Employee> empList, String namaFile) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        mapper.writeValue(baos, empList);
        byte [] data = baos.toByteArray();
        ObjectWriter ow = mapper.writer(new DefaultPrettyPrinter());
        ow.writeValue(new File(namaFile), empList);
    }
}

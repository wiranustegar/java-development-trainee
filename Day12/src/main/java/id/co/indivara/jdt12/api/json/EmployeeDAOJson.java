package id.co.indivara.jdt12.api.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import id.co.indivara.jdt12.api.entity.Employee;
import id.co.indivara.jdt12.dao.EmployeeDAO;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOJson {
    private EmployeeDAO dao;
    public EmployeeDAOJson (EmployeeDAO dao) {
        this.dao = dao;
    }

    public void createEmployeeJson(String namaFileJson) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        Employee emp = mapper.readValue(new File(namaFileJson), Employee.class);
        dao.createEmployee(emp);
        System.out.println("===DATA Employee Berhasil diinsert===");

    }

    public void updateEmployeeJson(String namaFileJson) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Employee emp = mapper.readValue(new File(namaFileJson), Employee.class);
        dao.updateEmployee(emp);
        System.out.println("===DATA Employee Berhasil diupdate===");
    }

    public void deleteEmployeeJson(String namaFileJson) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Employee emp = mapper.readValue(new File(namaFileJson), Employee.class);
        dao.deleteEmployee(emp.getEmployeeId());
        System.out.println("===DATA Employee Berhasil didelete===");
    }

    public void findEmployeeByIdJson(int employeeId, String namaFile) throws Exception {
        //diprint dalam bentuk json
        ObjectMapper mapper = new ObjectMapper();
        Employee emp = dao.findEmployeeById(employeeId);
        mapper.writeValue(new File(namaFile), emp);
        System.out.println("Data employee ada di: " + namaFile);
    }

    public void createManyEmployeeJson(String namaFileArrayJson) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        List<Employee> empList = mapper.readValue(new File(namaFileArrayJson),
                new TypeReference<List<Employee>>() {
        });
        dao.createManyEmployee((ArrayList<Employee>) empList);
        System.out.println("===Data Employee berhasil dicreate===");

    }

    public void findAllEmployeeJson(String namaFile) throws Exception {
        ArrayList<Employee> allEmp = dao.findAllEmployee();
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter ow = mapper.writer(new DefaultPrettyPrinter());
        ow.writeValue(new File(namaFile), allEmp);
    }

}

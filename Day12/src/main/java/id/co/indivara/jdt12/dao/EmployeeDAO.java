package id.co.indivara.jdt12.dao;

import id.co.indivara.jdt12.api.entity.Employee;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {

    public Connection konek() throws Exception{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        String userName = "hr";
        String password = "hr";
        String url = "jdbc:mysql://localhost:3306/hr";
        Connection conn = DriverManager.getConnection(url, userName, password);

        return conn;
    }

    public int createEmployee(Employee e) throws Exception {
        int jumlahRecord = 0;

        Connection conn = konek();
        String sql = "INSERT INTO karyawan (employee_id, first_name, salary) VALUES (?,?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setInt(1,e.getEmployeeId());
        stm.setString(2,e.getFirstName());
        stm.setDouble(3,e.getSalary());

        jumlahRecord = stm.executeUpdate();
        conn.close();

        return jumlahRecord;
    }

    public int updateEmployee (Employee e) throws Exception {
        int jumlahRecord = 0;

        Connection conn = konek();
        String sql = "UPDATE karyawan SET first_name=?, salary=? WHERE employee_id=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1,e.getFirstName());
        stm.setDouble(2,e.getSalary());
        stm.setInt(3,e.getEmployeeId());

        jumlahRecord = stm.executeUpdate();
        System.out.println("Berhasil Mengupdate" + jumlahRecord);

        conn.close();

        return jumlahRecord;
    }

    public int deleteEmployee (int employeeId) throws Exception {
        int jumlahRecord = 0;

        Connection conn = konek();

        String sql = "DELETE FROM karyawan WHERE employee_id=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setInt(1,employeeId);

        jumlahRecord = stm.executeUpdate();
        System.out.println("Berhasil menghapus " + jumlahRecord);

        conn.close();

        return jumlahRecord;
    }

    public Employee findEmployeeById (int employeeId) throws Exception {
        Employee emp = null;

        Connection conn = konek();
        String sql = "SELECT * FROM karyawan WHERE employee_id=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setInt(1,employeeId);
        ResultSet hasil = stm.executeQuery();

        if (hasil.next()){
            emp = new Employee(hasil.getInt("employee_id"),
                    hasil.getString("first_name"),
                    hasil.getDouble("salary"));
        }

        return emp;
    }

    public ArrayList<Employee> findAllEmployee () throws Exception {
        ArrayList<Employee> all = new ArrayList<>();

        Connection conn = konek();
        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM karyawan";
        ResultSet hasil = stm.executeQuery(sql);
        while (hasil.next()){
            Employee emp = new Employee(hasil.getInt("employee_id"),
                    hasil.getString("first_name"),
                    hasil.getDouble("salary"));
            all.add(emp);
        }

        return all;
    }

    public int createManyEmployee (ArrayList<Employee> e) throws Exception {
        int jumlahRecord = 0;
        for (Employee emp : e){
            createEmployee(emp);
            jumlahRecord++;
        }

        return jumlahRecord;
    }

}

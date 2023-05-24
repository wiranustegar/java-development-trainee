package id.co.indivara.db.dao;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;
import id.co.indivara.db.entity.Employee;

public class EmployeeDAO {
    public Connection konek(){
        Connection conn = null;

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String userName = "hr";
            String password = "hr";
            String url = "jdbc:mysql://localhost:3306/hr";

            conn = DriverManager.getConnection(url,userName, password);
        }catch (Exception ex){
            System.out.println("Ada error koneksi: " + ex.getMessage());
        }
        return conn;
    };

    public Employee findEmployee (int nip){
        Employee em = null;

        try {
            Connection conn = konek();

            String sql = "SELECT * FROM karyawan WHERE employee_id=?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1,nip);
            ResultSet hasil = stm.executeQuery();

            if (hasil.next()){
                em = new Employee(hasil.getInt("employee_id"),
                        hasil.getString("first_name"),
                        hasil.getDouble("salary"));
            }
            conn.close();
        }catch (Exception ex){
            System.out.println("Ada error: " + ex.getMessage());
        }

        return em;
    }

    public ArrayList<Employee> findAllEmployee(){
        ArrayList<Employee> all = new ArrayList<Employee>();
        try {
            Connection conn = konek();
            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM karyawan";
            ResultSet hasil = stm.executeQuery(sql);
            while (hasil.next()){
                Employee em = new Employee(hasil.getInt("employee_id"),
                        hasil.getString("first_name"),
                        hasil.getDouble("salary"));
                all.add(em);
            }

        }catch (Exception ex){
            System.out.println("Ada error di findAllEmployee " + ex.getMessage());
        }
        return all;
    }

    public int removeEmployee (int nip){
        int jumlahRecord = 0;

        try {
            Connection conn = konek();
            String sql = "DELETE FROM karyawan WHERE employee_id=?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1,nip);
            jumlahRecord = stm.executeUpdate();

            conn.close();
        } catch (Exception ex){
            System.out.println("Ada error di Remove Employee " + ex.getMessage());
        }

        return jumlahRecord;
    }

    public int createEmployee (Employee e){
        int jumlahRecord = 0;

        try {
            Connection conn = konek();
            String sql = "INSERT INTO karyawan (employee_id, first_name, salary) VALUES(?,?,?)";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1,e.getEmployeeId());
            stm.setString(2, e.getFirstName());
            stm.setDouble(3, e.getSalary());

            jumlahRecord = stm.executeUpdate();
            conn.close();
        } catch (Exception ex){
            System.out.println("Ada error di Create Employee " + ex.getMessage());
        }

        return jumlahRecord;
    }

    public int updateEmployee (Employee em){
        int jumlahRecord = 0;
        try {
            Connection conn = konek();

            String sql = "UPDATE karyawan SET first_name=?, salary=? WHERE employee_id=?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1,em.getFirstName());
            stm.setDouble(2,em.getSalary());
            stm.setInt(3,em.getEmployeeId());

            jumlahRecord = stm.executeUpdate();
            System.out.println(jumlahRecord + " Berhasil terupdate");
        } catch (Exception ex){
            System.out.println("Ada error di Update Employee " + ex.getMessage());
        }
        return jumlahRecord;
    }

    public int createManyEmployees(ArrayList<Employee> em){
        int jumlahRecord = 0;
        for (Employee x : em){
            createEmployee(x);
            jumlahRecord++;
        }

        return jumlahRecord;
    }

    public ArrayList<Employee> findByFirstName (String nama){
        ArrayList<Employee> find = new ArrayList<>();

        try {
            Connection conn = konek();
            String sql = "SELECT * FROM karyawan WHERE first_name=?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1,nama);
            ResultSet hasil = stm.executeQuery();
            while (hasil.next()){
                Employee em = new Employee(hasil.getInt("employee_id"),
                        hasil.getString("first_name"),
                        hasil.getDouble("salary"));
                find.add(em);
            }

            conn.close();

        }catch (Exception ex){
            System.out.println("Ada error di findByFirstName " + ex.getMessage());
        }
        return find;
    }
}


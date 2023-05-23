package id.co.indivara.jdt12.hrd;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class CariDB {
    public static void main(String[] args) throws Exception {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        String userName = "hr";
        String password = "hr";
        String url = "jdbc:mysql://localhost:3306/hr";

        Connection conn = DriverManager.getConnection(url, userName, password);

//        Statement stm = conn.createStatement();
        String sql = "SELECT * FROM karyawan WHERE employee_id=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, "100");

        ResultSet hasil = stm.executeQuery();
        if (hasil.next()){
            System.out.println("NIP: " + hasil.getString("employee_id"));
            System.out.println("NAMA: " + hasil.getString("first_name"));
            System.out.println("SALARY: " + hasil.getString("salary"));
            System.out.println("========================");
        } else {
            System.out.println("Data tidak ditemukan");
        }

        conn.close();
    }
}

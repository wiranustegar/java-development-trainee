package id.co.indivara.jdt12.hrd;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class UpdateDB {
    public static void main(String[] args) throws Exception {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        String userName = "hr";
        String password = "hr";
        String url = "jdbc:mysql://localhost:3306/hr";

        Connection conn = DriverManager.getConnection(url, userName, password);

//        Statement stm = conn.createStatement();
        String sql = "UPDATE karyawan SET first_name=?,salary=? WHERE employee_id=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, "Budi");
        stm.setInt(2, 1000);
        stm.setString(3, "100");

        int hasil =  stm.executeUpdate();
        System.out.println(hasil + " Baris terupdate");

        conn.close();
    }
}

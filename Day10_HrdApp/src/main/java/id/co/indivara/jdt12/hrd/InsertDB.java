package id.co.indivara.jdt12.hrd;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class InsertDB {
    public static void main(String[] args) throws Exception {

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        String userName = "hr";
        String password = "hr";
        String url = "jdbc:mysql://localhost:3306/hr";

        Connection conn = DriverManager.getConnection(url, userName, password);

        String sql = "INSERT INTO karyawan VALUES(?,?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, "998");
        stm.setString(2, "Joko");
        stm.setInt(3, 2000);

        int hasil =  stm.executeUpdate();
        System.out.println(hasil + " Baris terinsert");

        conn.close();
    }
}

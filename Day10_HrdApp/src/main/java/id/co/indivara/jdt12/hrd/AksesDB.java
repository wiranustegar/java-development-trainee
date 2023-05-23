package id.co.indivara.jdt12.hrd;
import java.sql.*;
import com.mysql.jdbc.Driver;

public class AksesDB {
    public static void main(String[] args) throws Exception {

        //load driver JDBC
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //Buat object connection
        String userName = "hr";
        String password = "hr";
        String url = "jdbc:mysql://localhost:3306/hr";

        Connection conn = DriverManager.getConnection(url,userName,password);

        //Buat onject STATEMENT
        Statement stm = conn.createStatement();

        //Siapkan perintah SQL
        String perintahSQL = "SELECT * FROM karyawan";

        //Eksekusi Perintah SSQL
        ResultSet hasil = stm.executeQuery(perintahSQL);

        //Olah hasil
        while (hasil.next()){
            System.out.println("NIP: " + hasil.getString("employee_id"));
            System.out.println("NAMA: " + hasil.getString("first_name"));
            System.out.println("SALARY: " + hasil.getString("salary"));
            System.out.println("========================");
        }

        //TUTUP KONEKSI
        conn.close();
    }
}

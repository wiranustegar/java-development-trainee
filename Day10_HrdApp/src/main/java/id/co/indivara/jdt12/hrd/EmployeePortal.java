package id.co.indivara.jdt12.hrd;
import java.sql.*;
import java.util.Scanner;

import com.mysql.jdbc.Driver;
import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

public class EmployeePortal {

    public static Scanner scan = new Scanner(System.in);
    static Connection konek() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        String userName = "hr";
        String password = "hr";
        String url = "jdbc:mysql://localhost:3306/hr";

        Connection conn = DriverManager.getConnection(url, userName, password);

        return conn;
    }

    static boolean insertKaryawan(String nip, String nama, int gaji) throws SQLException {

        Connection conn = konek();


        String sql = "INSERT INTO karyawan VALUES(?,?,?)";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, nip);
        stm.setString(2, nama);
        stm.setInt(3, gaji);

        int hasil =  stm.executeUpdate();
        System.out.println(hasil + " Employee terinsert");

        conn.close();

        if (hasil>0){
            return true;
        }
        return false;
    }

    static boolean deleteKaryawan(String nip) throws SQLException {
        Connection conn = konek();

        String sql = "DELETE FROM karyawan WHERE employee_id=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1,nip);
        int hasil = stm.executeUpdate();
        conn.close();
        System.out.println(hasil + " Employee terdelete");
        if (hasil>0){
            return true;
        }
        return false;
    }

    static boolean updateKaryawan(String nip, String nama, int gaji) throws SQLException {

        Connection conn = konek();


        String sql = "UPDATE karyawan SET first_name=?,salary=? WHERE employee_id=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, nama);
        stm.setInt(2, gaji);
        stm.setString(3, nip);

        int hasil =  stm.executeUpdate();
        System.out.println(hasil + " Employee terupdate");

        conn.close();

        if (hasil>0){
            return true;
        }
        return false;
    }

    static void cariKaryawan(String nip) throws SQLException {
        Connection conn = konek();


        String sql = "SELECT * FROM karyawan WHERE employee_id=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, nip);

        ResultSet hasil = stm.executeQuery();
        if (hasil.next()){
            System.out.println("NIP: " + hasil.getString("employee_id"));
            System.out.println("NAMA: " + hasil.getString("first_name"));
            System.out.println("SALARY: " + hasil.getString("salary"));
            System.out.println("=============================");
        } else {
            System.out.println("Data Employee tidak ditemukan");
        }

        conn.close();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("=========EMPLOYEE PORTAL=========");
        System.out.println("1). CARI KARYAWAN");
        System.out.println("2). INSERT KARYAWAN");
        System.out.println("3). UPDATE KARYAWAN");
        System.out.println("4). DELETE KARYAWAN");
        System.out.println("5). EXIT");

        while (true){
            System.out.print("PILIH [1/2/3/4/5]: ");
            int pilih = Integer.parseInt(scan.nextLine());

            if (pilih==1){
                System.out.println("=========CARI KARYAWAN=========");
                System.out.print("NIP: ");
                String nip = scan.nextLine();
                cariKaryawan(nip);
            } else if (pilih==2) {
                System.out.println("=========INSERT KARYAWAN=========");
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                System.out.print("NIP: ");
                String nip = scan.nextLine();
                System.out.println("Salary: ");
                int gaji = Integer.parseInt(scan.nextLine());
                insertKaryawan(nip,nama,gaji);
            } else if (pilih==3) {
                System.out.println("=========UPDATE KARYAWAN=========");
                System.out.print("NIP yang akan diupdate: ");
                String nip = scan.nextLine();
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                System.out.print("Salary: ");
                int gaji = Integer.parseInt(scan.nextLine());
                updateKaryawan(nip,nama,gaji);
            } else if (pilih==4) {
                System.out.println("=========DELETE KARYAWAN=========");
                System.out.print("NIP: ");
                String nip = scan.nextLine();
                deleteKaryawan(nip);
            } else if (pilih==5){
                break;
            }
        }
    }
}

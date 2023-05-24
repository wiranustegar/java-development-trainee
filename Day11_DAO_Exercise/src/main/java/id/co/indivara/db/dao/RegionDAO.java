package id.co.indivara.db.dao;

import id.co.indivara.db.entity.Region;

import java.sql.*;
import java.util.ArrayList;

public class RegionDAO {
    public Connection konek(){
        Connection conn = null;

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String userName = "hr";
            String password = "hr";
            String url = "jdbc:mysql://localhost:3306/hr";

            conn = DriverManager.getConnection(url, userName, password);
        }catch (Exception ex){
            System.out.println("Ada error koneksi " + ex.getMessage());
        }

        return conn;
    }

    public Region findRegion (int regId){
        Region re = null;

        try {
            Connection conn = konek();

            String sql = "SELECT * FROM regions WHERE region_id=?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1,regId);
            ResultSet hasil = stm.executeQuery();

            if (hasil.next()){
                re = new Region(hasil.getInt("region_id"),
                        hasil.getString("region_name"));
            }

            conn.close();

        }catch (Exception ex){
            System.out.println("Ada error: " + ex.getMessage());
        }

        return re;
    }

    public ArrayList<Region> findAllRegion(){
        ArrayList<Region> all = new ArrayList<>();
        try {
            Connection conn = konek();
            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM regions";
            ResultSet hasil = stm.executeQuery(sql);
            while (hasil.next()){
                Region re = new Region(hasil.getInt("region_id"),
                        hasil.getString("region_name"));
                all.add(re);
            }

        }catch (Exception ex){
            System.out.println("Ada error di findAllRegion " + ex.getMessage());
        }
        return all;
    }

    public int removeRegion(int regId){
        int jumlahRecord = 0;

        try {
            Connection conn = konek();
            String sql = "DELETE FROM regions WHERE region_id=?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1,regId);
            jumlahRecord = stm.executeUpdate();

            conn.close();
        } catch (Exception ex){
            System.out.println("Ada error di Remove Region " + ex.getMessage());
        }

        return jumlahRecord;
    }

    public int createRegion(Region r){
        int jumlahRecord = 0;

        try {
            Connection conn = konek();
            String sql = "INSERT INTO regions (region_id, region_name) VALUES(?,?)";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1,r.getRegionId());
            stm.setString(2, r.getRegionName());

            jumlahRecord = stm.executeUpdate();
            conn.close();
        } catch (Exception ex){
            System.out.println("Ada error di Create Region " + ex.getMessage());
        }

        return jumlahRecord;
    }

    public int updateRegion(Region re){
        int jumlahRecord = 0;
        try {
            Connection conn = konek();

            String sql = "UPDATE regions SET region_name=? WHERE region_id=?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1,re.getRegionName());
            stm.setInt(2,re.getRegionId());

            jumlahRecord = stm.executeUpdate();
            System.out.println(jumlahRecord + " Berhasil terupdate");
        } catch (Exception ex){
            System.out.println("Ada error di Update Region " + ex.getMessage());
        }
        return jumlahRecord;
    }

    public int createManyRegion(ArrayList<Region> re){
        int jumlahRecord = 0;
        for (Region x : re){
            createRegion(x);
            jumlahRecord++;
        }

        return jumlahRecord;
    }

    public ArrayList<Region> findByFirstRegionName(String nama){
        ArrayList<Region> find = new ArrayList<>();

        try {
            Connection conn = konek();
            String sql = "SELECT * FROM regions WHERE region_name=?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1,nama);
            ResultSet hasil = stm.executeQuery();
            while (hasil.next()){
                Region r = new Region(hasil.getInt("region_id"),
                        hasil.getString("region_name"));
                find.add(r);
            }

            conn.close();

        }catch (Exception ex){
            System.out.println("Ada error di findByFirstName " + ex.getMessage());
        }
        return find;
    }
}

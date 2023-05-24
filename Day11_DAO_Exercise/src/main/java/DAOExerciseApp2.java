import id.co.indivara.db.dao.RegionDAO;
import id.co.indivara.db.entity.Region  ;
import java.util.ArrayList;
import java.util.Scanner;

public class DAOExerciseApp2 {

    public static Scanner scan = new Scanner(System.in);

    static void cariRegion(int regId){
        //TEST CARI EMPLOYEE
        RegionDAO dao = new RegionDAO();
        Region cari = dao.findRegion(regId);
        if (cari !=null){
            System.out.println("Reg ID: " + cari.getRegionId());
            System.out.println("NAMA: " + cari.getRegionName());
        } else {
            System.out.println("Region not found");
        }

    }

    static void cariSemuaRegion(){
        //TEST CARI SEMUA EMPLOYEE
        RegionDAO dao = new RegionDAO();
        ArrayList<Region> all = dao.findAllRegion();
        for (Region em : all){
            System.out.println("Reg ID = " + em.getRegionId());
            System.out.println("Reg Nama = " + em.getRegionName());
            System.out.println("===================");
        }
    }

    static boolean insertRegion(int regid, String nama){
        //TEST INSERT EMPLOYEE
        RegionDAO dao = new RegionDAO();
        Region tambah = new Region(regid, nama);
        int hasil = dao.createRegion(tambah);
        System.out.println("Berhasil terinsert " + hasil);
        System.out.println("===DATA ADDED===");
        System.out.println(tambah);
        System.out.println("================");

        if (hasil>0){
            return true;
        }
        return false;
    }

    static boolean updateRegion(int regid, String nama){
        //TEST UPDATE EMPLOYEE
        RegionDAO dao = new RegionDAO();
        Region upd = new Region(regid,nama);
        int hasil = dao.updateRegion(upd);
        System.out.println("Berhasil mengupdate = " + hasil);

        if (hasil>0){
            return true;
        }

        return false;
    }

    static void findByFirstName(String nama){
        //TEST FINDBYNAME EMPLOYEE
        RegionDAO dao = new RegionDAO();
        ArrayList<Region> findName = dao.findByFirstRegionName(nama);
        for (Region em : findName){
            System.out.println("Reg ID: " + em.getRegionId());
            System.out.println("Reg Name: " + em.getRegionName());
        }
    }

    static void deleteEmploye(int regid){
        //TEST REMOVE EMPLOYEE
        RegionDAO dao = new RegionDAO();
        int hasilDelete = dao.removeRegion(regid);
        System.out.println("Berhasil menghapus " + hasilDelete + " data");
    }

    public static void main(String[] args) {
        System.out.println("=========EMPLOYEE PORTAL=========");
        System.out.println("1). CARI REGION" +
                "");
        System.out.println("2). INSERT REGION" +
                "");
        System.out.println("3). UPDATE REGION" +
                "");
        System.out.println("4). TAMPILKAN SEMUA REGION" +
                "");
        System.out.println("5). CARI NAMA REGION" +
                "");
        System.out.println("6). DELETE REGION" +
                "");
        System.out.println("7). EXIT");

        while (true){
            System.out.print("PILIH [1/2/.../7]: ");
            int pilih = Integer.parseInt(scan.nextLine());

            if (pilih==1){
                System.out.println("=========CARI REGION" +
                        "=========");
                System.out.print("RegID: ");
                int regid = Integer.parseInt(scan.nextLine());
                cariRegion(regid);
            } else if (pilih==2) {
                System.out.println("=========INSERT REGION" +
                        "=========");
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                System.out.print("RegID: ");
                int regid = Integer.parseInt(scan.nextLine());
                insertRegion(regid,nama);
            } else if (pilih==3) {
                System.out.println("=========UPDATE REGION" +
                        "=========");
                System.out.print("RegID yang akan diupdate: ");
                int regid = Integer.parseInt(scan.nextLine());
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                updateRegion(regid,nama);
            } else if (pilih==4) {
                System.out.println("=========TAMPLIKAN SEMUA REGION" +
                        "=========");
                cariSemuaRegion();
            } else if (pilih==5) {
                System.out.println("=========CARI REGION" +
                        " BY NAME=========");
                System.out.print("NAMA: ");
                String nama = scan.nextLine();
                findByFirstName(nama);
            } else if (pilih==6) {
                System.out.println("=========DELETE REGION=========");
                System.out.print("regid yang akan didelete: ");
                int regid = Integer.parseInt(scan.nextLine());
                deleteEmploye(regid);
            } else if (pilih==7){
                break;
            }
        }
    }
}

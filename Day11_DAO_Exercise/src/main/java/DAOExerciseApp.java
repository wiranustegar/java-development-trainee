import id.co.indivara.db.dao.RegionDAO;
import id.co.indivara.db.entity.Region;

import java.util.ArrayList;

public class DAOExerciseApp {
    public static void main(String[] args) {
        RegionDAO dao = new RegionDAO();

        //TEST CARI REGION
        Region indo = dao.findRegion(1);
        if (indo !=null){
            System.out.println("Reg ID: " + indo.getRegionId());
            System.out.println("Reg Name: " + indo.getRegionName());
        } else {
            System.out.println("Region not found");
        }

        //CARI SEMUA REGION
//        ArrayList<Region> all = dao.findAllRegion();
//        for (Region re : all){
//            System.out.println("Reg ID = " + re.getRegionId());
//            System.out.println("Reg Name = " + re.getRegionName());
//            System.out.println("===================");
//        }

        //TEST INSERT EMPLOYEE
//        Region indo = new Region(99,"Uganda");
//        int hasil = dao.createRegion(indo);
//        System.out.println("Berhasil terinsert " + hasil);
//        System.out.println("===DATA ADDED===");
//        System.out.println(indo);
//        System.out.println("================");

        //TEST REMOVE EMPLOYEE
//        int hasilDelete = dao.removeRegion(99);
//        System.out.println("Berhasil menghapus " + hasilDelete + " data");

        //TEST FINDBYNAME EMPLOYEE
//        ArrayList<Region> findName = dao.findByFirstRegionName("Europe");
//        for (Region em : findName){
//            System.out.println("Reg ID: " + em.getRegionId());
//            System.out.println("Reg Name: " + em.getRegionName());
//        }

        //TEST UPDATE EMPLOYEE
        Region upd = new Region(99,"Europe");
        int hasi = dao.updateRegion(upd);
        System.out.println("Berhasil mengupdate " + hasi);

    }
}

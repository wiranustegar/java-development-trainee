import id.co.indivara.db.dao.EmployeeDAO;
import id.co.indivara.db.entity.Employee;
import java.util.ArrayList;
import java.util.Scanner;

public class HRDApp2 {

    public static Scanner scan = new Scanner(System.in);

    static void cariEmployee(int nip){
        //TEST CARI EMPLOYEE
        EmployeeDAO dao = new EmployeeDAO();
        Employee cari = dao.findEmployee(nip);
        if (cari !=null){
            System.out.println("NIP: " + cari.getEmployeeId());
            System.out.println("NAMA: " + cari.getFirstName());
            System.out.println("GAJI: " + cari.getSalary());
        } else {
            System.out.println("Employee not found");
        }

    }

    static void cariSemuaEmployee(){
        //TEST CARI SEMUA EMPLOYEE
        EmployeeDAO dao = new EmployeeDAO();
        ArrayList<Employee> all = dao.findAllEmployee();
        for (Employee em : all){
            System.out.println("NIP = " + em.getEmployeeId());
            System.out.println("NAMA = " + em.getFirstName());
            System.out.println("GAJI = " + em.getSalary());
            System.out.println("===================");
        }
    }

    static boolean insertEmployee(int nip, String nama, double gaji){
        //TEST INSERT EMPLOYEE
        EmployeeDAO dao = new EmployeeDAO();
        Employee tambah = new Employee(nip, nama,gaji);
        int hasil = dao.createEmployee(tambah);
        System.out.println("Berhasil terinsert " + hasil);
        System.out.println("===DATA ADDED===");
        System.out.println(tambah);
        System.out.println("================");

        if (hasil>0){
            return true;
        }
        return false;
    }

    static boolean updateEmployee(String nama, int nip, double gaji){
        //TEST UPDATE EMPLOYEE
        EmployeeDAO dao = new EmployeeDAO();
        Employee upd = new Employee(nip,nama,gaji);
        int hasil = dao.updateEmployee(upd);
        System.out.println("Berhasil mengupdate = " + hasil);

        if (hasil>0){
            return true;
        }

        return false;
    }

    static void findByFirstName(String nama){
        //TEST FINDBYNAME EMPLOYEE
        EmployeeDAO dao = new EmployeeDAO();
        ArrayList<Employee> findName = dao.findByFirstName(nama);
        for (Employee em : findName){
            System.out.println("NIP: " + em.getEmployeeId());
            System.out.println("NAMA: " + em.getFirstName());
            System.out.println("GAJI: " + em.getSalary());
        }
    }

    static void deleteEmploye(int nip){
        //TEST REMOVE EMPLOYEE
        EmployeeDAO dao = new EmployeeDAO();
        int hasilDelete = dao.removeEmployee(nip);
        System.out.println("Berhasil menghapus " + hasilDelete + " data");
    }

    public static void main(String[] args) {
        System.out.println("=========EMPLOYEE PORTAL=========");
        System.out.println("1). CARI EMPLOYEE" +
                "");
        System.out.println("2). INSERT EMPLOYEE" +
                "");
        System.out.println("3). UPDATE EMPLOYEE" +
                "");
        System.out.println("4). TAMPILKAN SEMUA EMPLOYEE" +
                "");
        System.out.println("5). CARI NAMA EMPLOYEE" +
                "");
        System.out.println("6). DELETE EMPLOYEE" +
                "");
        System.out.println("7). EXIT");

        while (true){
            System.out.print("PILIH [1/2/.../7]: ");
            int pilih = Integer.parseInt(scan.nextLine());

            if (pilih==1){
                System.out.println("=========CARI EMPLOYEE" +
                        "=========");
                System.out.print("NIP: ");
                int nip = Integer.parseInt(scan.nextLine());
                cariEmployee(nip);
            } else if (pilih==2) {
                System.out.println("=========INSERT EMPLOYEE" +
                        "=========");
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                System.out.print("NIP: ");
                int nip = Integer.parseInt(scan.nextLine());
                System.out.print("Salary: ");
                double gaji = Double.parseDouble(scan.nextLine());
                insertEmployee(nip,nama,gaji);
            } else if (pilih==3) {
                System.out.println("=========UPDATE EMPLOYEE" +
                        "=========");
                System.out.print("NIP yang akan diupdate: ");
                int nip = Integer.parseInt(scan.nextLine());
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                System.out.print("Salary: ");
                double gaji = Double.parseDouble(scan.nextLine());
                updateEmployee(nama,nip,gaji);
            } else if (pilih==4) {
                System.out.println("=========TAMPLIKAN SEMUA EMPLOYEE" +
                        "=========");
                cariSemuaEmployee();
            } else if (pilih==5) {
                System.out.println("=========CARI EMPLOYEE" +
                        " BY NAME=========");
                System.out.print("NAMA: ");
                String nama = scan.nextLine();
                findByFirstName(nama);
            } else if (pilih==6) {
                System.out.println("=========DELETE EMPLOYEE=========");
                System.out.print("NIP yang akan didelete: ");
                int nip = Integer.parseInt(scan.nextLine());
                deleteEmploye(nip);
            } else if (pilih==7){
                break;
            }
        }
    }
}

import id.co.indivara.jdt12.entity.Pegawai;
import id.co.indivara.jdt12.init.PegawaiInitJPA;
import id.co.indivara.jdt12.json.PegawaiJson;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class PegawaiCRUDJPAApp {

    static void createPegawai(String namaFileJson) throws Exception{
        PegawaiInitJPA init = new PegawaiInitJPA();
        PegawaiJson peg = new PegawaiJson(init);
        peg.createPegawaiJson(namaFileJson);
    }

    static void showAllData(String namaFileTujuan) throws Exception{
        PegawaiInitJPA init = new PegawaiInitJPA();
        init.showAllPegawai(namaFileTujuan);
    }

    static void showDataById(int nip, String namaFileTujuan) throws Exception{
        PegawaiInitJPA init = new PegawaiInitJPA();
        init.showPegawaiById(nip,namaFileTujuan);
    }

    static void createManyPegawai(String namaFileArrayJson)throws Exception{
        PegawaiInitJPA init = new PegawaiInitJPA();
        PegawaiJson peg = new PegawaiJson(init);
        peg.createManyPegawaiJson(namaFileArrayJson);
    }

    static void updatePegawai(String namaFile) throws Exception{
        PegawaiInitJPA init = new PegawaiInitJPA();
        PegawaiJson peg = new PegawaiJson(init);
        peg.updatePegawaiJson(namaFile);
    }

    static void removePegawai(int nip) throws Exception{
        PegawaiInitJPA init = new PegawaiInitJPA();
        init.removePegawai(nip);
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("===MENU===");
            System.out.println("1). TAMPILKAN SEMUA PEGAWAI");
            System.out.println("2). INPUT DATA PEGAWAI");
            System.out.println("3). CARI DATA PEGAWAI");
            System.out.println("4). UPDATE DATA PEGAWAI");
            System.out.println("5). INPUT BANYAK PEGAWAI");
            System.out.println("6). HAPUS DATA PEGAWAI");
            System.out.println("7). EXIT");

            System.out.print("PILIH [1/2/.../7]: ");
            int pilih = Integer.parseInt(scan.nextLine());

            if (pilih==1){
                System.out.print("Nama File Tujuan Data All Pegawai: ");
                String namaFileTujuan = scan.nextLine();
                showAllData(namaFileTujuan);
            } else if (pilih==2) {
                System.out.print("Nama File Insert Pegawai: ");
                String namaFileJson = scan.nextLine();
                createPegawai(namaFileJson);
            } else if (pilih==3) {
                System.out.print("NIP: ");
                int nip = Integer.parseInt(scan.nextLine());
                System.out.print("Simpan file di - ");
                String namaFileTujuan = scan.nextLine();
                showDataById(nip,namaFileTujuan);
            } else if (pilih==4) {
                System.out.print("Nama File Update Pegawai: ");
                String namaFileJson = scan.nextLine();
                updatePegawai(namaFileJson);
            } else if (pilih==5) {
                System.out.print("Nama File Input Banyak Pegawai: ");
                String namaFileArrayJson = scan.nextLine();
                createManyPegawai(namaFileArrayJson);
            } else if (pilih==6) {
                System.out.print("NIP yg akan didelete: ");
                int nip = Integer.parseInt(scan.nextLine());
                removePegawai(nip);

            } else if (pilih==7){
                break;
            }
        }

    }

}

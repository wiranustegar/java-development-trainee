import java.util.ArrayList;
import java.util.Scanner;


public class ExerciseArrayList {
    public static void prosesData(){
        Scanner sc = new Scanner(System.in);
        String inputan = "y";

        ArrayList<Mahasiswa> daftar = new ArrayList<Mahasiswa>();
        while (inputan.equalsIgnoreCase("y")) {
            System.out.println("=====Menu====");
            System.out.println("1. Entry Data Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan anda [1/2/3] : ");
            int pilihan = Integer.parseInt(sc.nextLine());
            if (pilihan == 1) {
                System.out.print("Masukan NIM : ");
                String nim = sc.nextLine();
                System.out.print("Masukan NAMA: ");
                String nama = sc.nextLine();
                System.out.print("Masukan IPK : ");
                double ipk = Double.parseDouble(sc.nextLine());
                daftar.add(new Mahasiswa(nim, nama, ipk));
            } else if (pilihan == 2) {
                for (int i = 0; i < daftar.size(); i++) {
                    daftar.get(i).cetakData();
                }
            }else {
                inputan = "t";
            }
        }

    }

    public static void main(String[] args) {

        prosesData();
    }
}
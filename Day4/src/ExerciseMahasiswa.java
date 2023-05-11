import java.util.Scanner;

public class ExerciseMahasiswa {

    public static void tampilkanMenu(){
        System.out.println("=======MENU========");
    }

    public static Mahasiswa[] inputData(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa ");
        int jumlahMahasiswa = Integer.parseInt(scan.nextLine());
        Mahasiswa[] daftar = new Mahasiswa[jumlahMahasiswa];
        for (int i = 0; i < daftar.length; i++){
            daftar[i] = new Mahasiswa();
            System.out.println("====INPUT=====");
            System.out.print("NAMA: ");
            daftar[i].nama = scan.nextLine();
            System.out.print("NIM: ");
            daftar[i].nim = scan.nextLine();
            System.out.print("IPK: ");
            daftar[i].ipk = Double.parseDouble(scan.nextLine());
            System.out.print("Aktif? ");
            daftar[i].isAktif = Boolean.parseBoolean(scan.nextLine());
        }

        return daftar;


    }

    public static void outputData(Mahasiswa[] m){
        System.out.println("=====OUTPUT======");
        for (Mahasiswa siswa:m){
            System.out.println("NAMA = " + siswa.nama);
            System.out.println("NIM = " + siswa.nim);
            System.out.println("AKTIF = " + siswa.ipk);
            System.out.println("Aktif = " + siswa.isAktif);
            System.out.println("--------------------");
        }
    }


    public static void main(String[] args) {
        tampilkanMenu();
        Mahasiswa[] data = inputData();
        outputData(data);
    }
}

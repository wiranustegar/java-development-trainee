import java.util.Scanner;

public class DaftarNilaiMahasiswaMethod {

    public static String [][] inputNamaDanNilai(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa: ");
        int jumlahMahasiswa = Integer.parseInt(scan.nextLine());

        //array
        String mahasiswa [][] = new String[jumlahMahasiswa][2];

        //looping
        for (int i = 0; i < mahasiswa.length; i++){
            System.out.print("Mahasiswa: ");
            mahasiswa[i][0] = scan.nextLine();

            System.out.print("Nilai: ");
            mahasiswa[i][1] = scan.nextLine();
        }

        return mahasiswa;
    }

    public static void outputNamaDanNilai(String [][] daftar){

        System.out.println("====OUTPUT====");
        for (int i = 0; i < daftar.length; i++){
            System.out.println("Nama Siswa: " + daftar[i][0]);
            System.out.println("Nilai: " + daftar[i][1]);
            switch (daftar[i][1].toLowerCase()){
                case "a":
                    System.out.println("Excellent");
                    break;
                case "b":
                    System.out.println("Good");
                    break;
                case "c":
                    System.out.println("Fair");
                    break;
                case "d":
                    System.out.println("bad");
                    break;
                case "e":
                    System.out.println("Not passed");
                    break;
            }
            System.out.println("================");
        }

    }

    public static void main(String[] args) {

        String [][] data = inputNamaDanNilai();
        outputNamaDanNilai(data);

    }
}

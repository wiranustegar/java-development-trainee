import java.util.Scanner;

public class ArrayDaftarNilaiMahasiswa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa: ");
        int jumlahMahasiswa = Integer.parseInt(scan.nextLine());

        //array mahasiswa dan nilai
        String [] daftarMahasiswa = new String[jumlahMahasiswa];
        String [] daftarNilai = new String[jumlahMahasiswa];

        //looping
        for (int i = 0; i < daftarMahasiswa.length; i++){
            System.out.print("Mahasiswa: " + (i+1));
            daftarMahasiswa[i] = scan.nextLine();
            System.out.print("nilai: " + (i+1));
            daftarNilai[i] = scan.nextLine();
        }

        System.out.println("=====OUTPUT======");

        for (int i = 0; i < daftarMahasiswa.length; i++){
            System.out.println("Nama Siswa: " + daftarMahasiswa[i]);
            System.out.println("Nilai: " + daftarNilai[i]);

            switch (daftarNilai[i].toLowerCase()){
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
        }
    }
}

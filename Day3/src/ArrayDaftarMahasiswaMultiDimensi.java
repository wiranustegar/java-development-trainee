import java.util.Scanner;

public class ArrayDaftarMahasiswaMultiDimensi {
    public static void main(String[] args) {

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

        System.out.println("====OUTPUT====");
        for (int i = 0; i < mahasiswa.length; i++){
            System.out.println("Nama Siswa: " + mahasiswa[i][0]);
            System.out.println("Nilai: " + mahasiswa[i][1]);
            switch (mahasiswa[i][1].toLowerCase()){
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

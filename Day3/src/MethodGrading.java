import java.util.Scanner;

public class MethodGrading {

    public static String predikatNilai(String nilai){

        String grading = "";
        switch (nilai.toLowerCase()){
            case "a":
                grading = "Excellent";
                break;
            case "b":
                grading = "Good";
                break;
            case "c":
                grading = "Fair";
                break;
            case "d":
                grading = "Bad";
                break;
            case "e":
                grading = "Not passed";
                break;
        }

        return grading;

    }

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
            System.out.println(predikatNilai(daftar[i][1]));
            System.out.println("================");
        }

    }

    public static void main(String[] args) {

        String [][] data = inputNamaDanNilai();
        outputNamaDanNilai(data);

    }
}

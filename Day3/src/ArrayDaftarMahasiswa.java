import java.util.Scanner;

public class ArrayDaftarMahasiswa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Jumlah Mahasiswa: ");
        int jumlahMahasiswa = Integer.parseInt(scan.nextLine());

        //siapkan array
        String [] daftarMahasiswa = new String[jumlahMahasiswa];

        //melakukan looping untuk entry data
        for (int i = 0; i < daftarMahasiswa.length; i++){
            System.out.print("Mahasiswa " + (i+1) + ":");
            daftarMahasiswa[i] = scan.nextLine();
        }

        System.out.println("=====output======");

        //lakukan looping untuk mencetak isi array
        for (int i = 0; i < daftarMahasiswa.length; i++){
            System.out.println(daftarMahasiswa[i]);
        }

    }

}

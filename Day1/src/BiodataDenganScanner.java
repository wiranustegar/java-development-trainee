import java.util.Scanner;

public class BiodataDenganScanner {
    public static void main(String[] args) {

        Scanner tangkap = new Scanner(System.in);

        System.out.println("===========BIODATA APP================");

        System.out.print("Nama Lengkap: ");
        String namaLengkap = (tangkap.nextLine());

        System.out.print("Alamat: ");
        String alamat = (tangkap.nextLine());

        System.out.print("Umur: ");
        byte umur = Byte.parseByte(tangkap.nextLine());

        System.out.print("IPK: ");
        float ipk = Float.parseFloat(tangkap.nextLine());

        System.out.print("Angka: ");
        Integer angka = tangkap.nextInt();

        System.out.print("Marital Status: ");
        boolean status = Boolean.parseBoolean(tangkap.nextLine());


        System.out.println("===========BIODATA================");
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Alammat: " + alamat);
        System.out.println("Umur: " + umur);
        System.out.println("Angka: " + angka);
        System.out.println("IPK: " + ipk);
        System.out.println("Marital Status: " + status);

    }
}

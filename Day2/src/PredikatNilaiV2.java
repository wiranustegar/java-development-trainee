import java.util.Scanner;

public class PredikatNilaiV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        String nilai = scan.nextLine();

        System.out.print("Jenis Kelamin Anda: ");
        String gender = scan.nextLine();

        String predikat;

        if (nilai.equals("A")&&gender.equals("L")){
            predikat = "Wisudawan Excellent";
        } else if (nilai.equalsIgnoreCase("A")&&gender.equalsIgnoreCase("P")) {
            predikat = "Wisudawati Excellent";
        } else if (nilai.equalsIgnoreCase("B")&&gender.equalsIgnoreCase("L")) {
            predikat = "Wisudawan Good";
        } else if (nilai.equalsIgnoreCase("B")&&gender.equalsIgnoreCase("P")) {
            predikat = "Wisudawati Good";
        } else {
            predikat = "no such grade";
        }

        System.out.println("Nilai Anda = " + nilai);
        System.out.println("predikat = " + predikat);

    }
}

import java.util.Scanner;

public class DemoIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        String nilai = scan.nextLine();
        String predikat;

        if (nilai.equals("a")){
            predikat = "Excellent";
        } else if (nilai.equals("b")) {
            predikat = "Good";
        } else if (nilai.equals("c")) {
            predikat = "Fair";
        } else if (nilai.equals("d")) {
            predikat = "bad";
        } else if (nilai.equals("e")) {
            predikat = "fail";
        } else {
            predikat = "no such grade";
        }

        System.out.println("Nilai anda = " + nilai);
        System.out.println("predikat Anda = " + predikat);


    }
}

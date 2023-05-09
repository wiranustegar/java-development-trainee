import java.util.Scanner;

public class PredikatApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

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
            
            System.out.println("predikat Anda = " + predikat);

            while (true) {
                System.out.print("Lagi: ");
                String lagi = scan.nextLine().toLowerCase();
                if (!lagi.equals("y")&&(!lagi.equals("t"))){
                    continue;
                } else if (lagi.equals("y")){
                    break;
                } else if (lagi.equals("t")) {
                    System.exit(0);
                }
            }

        }

    }
}

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        String nilai = scan.nextLine();
        String predikat;

        switch (nilai.toLowerCase()){
            case "a":
                predikat = "Excellent";
                break;
            case "b":
                predikat = "Good";
                break;
            case  "c":
                predikat = "Fair";
                break;
            case "d":
                predikat = "bad";
                break;
            case "e":
                predikat = "fail";
                break;
            default:
                predikat = "no such grade";
                break;
        }

        System.out.println("Nilai Anda = " + nilai);
        System.out.println("predikat Anda = " + predikat);

    }
}

import java.util.Scanner;

public class SupermarketDummy {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Total Belanja: ");
        double totalBelanja = Double.parseDouble(scan.nextLine().toLowerCase());

        System.out.print("Punya Member? : ");
        String isMember = scan.nextLine();
        
        double levelDiskon = 0.0;

        if (totalBelanja < 1000){
            if (isMember.equals("y")){
                levelDiskon = 0.15;
            } else {
                levelDiskon = 0.1;
            }
        } else if ((totalBelanja >= 1000)&&(totalBelanja <=10000)) {
            if (isMember.equals("y")){
                levelDiskon = 0.25;
            } else {
                levelDiskon = 0.2;
            }
        } else if (totalBelanja > 10000) {
            if (isMember.equals("y")){
                levelDiskon = 0.35;
            } else {
                levelDiskon = 0.3;
            }
        }
        double diskon = totalBelanja * levelDiskon;
        double totalBayar = totalBelanja - diskon;

        System.out.println("totalBelanja = " + totalBelanja);
        System.out.println("diskon = " + diskon);
        System.out.println("totalBayar = " + totalBayar);

    }
}

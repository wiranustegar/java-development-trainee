import java.util.Scanner;

public class GeneratorBilangan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Angka Maksimal : ");
        int angkaMax = Integer.parseInt(scan.nextLine());

        System.out.print("GA/GE: ");
        String  tipeBil = scan.nextLine().toLowerCase();

        int i = 1;

        for (i=1; i<= angkaMax; i++){
            if ((i%2==0) && tipeBil.equals("ga")){
                System.out.println("Ini Genap " + i);
            } else if ((i%2==1) && tipeBil.equals("ge")) {
                System.out.println("Ini Ganjil " + i);
            }
        }

    }
}

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Angka Maksimal : ");
        int angkaMax = Integer.parseInt(scan.nextLine());

        System.out.print("GA/GE: ");
        String  tipeBil = scan.nextLine().toLowerCase();

        int i = 1;

        while ((i<angkaMax)&&(tipeBil.equals("ga"))){
            if (i%2==0){
                System.out.println(i);
                i++;
            }
        }

    }
}

import java.util.Scanner;

public class DemoWhileLoop2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Kata :");
        String kata = scan.nextLine();

        System.out.print("Jumlah :");
        int jumlah = Integer.parseInt(scan.nextLine());

        int i = 1;

        while (i <= jumlah){
            System.out.println(kata + " " + i);
            i++;
        }

    }
}

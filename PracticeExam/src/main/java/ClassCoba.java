import java.util.Scanner;

public class ClassCoba {

    public static void coba(int x, String y){

        for (int i = 0; i < x; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(y);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa angka: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Huruf apa: ");
        String y = sc.nextLine();
        coba(x, y);
    }

}

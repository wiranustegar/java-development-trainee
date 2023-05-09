import java.util.Scanner;

public class DemoInfinityLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("Nama: ");
            String nama = scan.nextLine();
            System.out.println("Selamat siang mas/mbak "+ nama);

            System.out.print("Mau disapa lagi? ");
            String sapa = scan.nextLine().toLowerCase();

            if (sapa.equals("t")){
                System.out.println("Sampai jumpa...");
                break;
            }

        }

    }
}

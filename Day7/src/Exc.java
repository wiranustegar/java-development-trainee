import java.util.Scanner;

public class Exc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            try {
                System.out.println("=========");
                System.out.print("Bil 1: ");
                int bil1 = Integer.parseInt(scan.nextLine());
                System.out.print("Bil 2: ");
                int bil2 = Integer.parseInt(scan.nextLine());
                int bagi = bil1/bil2;
                System.out.println("Hasil Bagi: " + bagi);
            } catch (NumberFormatException e1){
                System.out.println("Input harus angka");
            } catch (Exception e2){
                System.out.println("Terjadi pembagian 0");
            }

            System.out.println("Lagi: [y/t]");
            String pilih = scan.nextLine();
            if (pilih.equals("t")){
                break;
            }
        }
    }
}

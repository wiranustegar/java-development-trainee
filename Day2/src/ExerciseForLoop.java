import java.util.Scanner;

public class ExerciseForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Kata: ");
        String kata = scan.nextLine();

        System.out.print("Masukkan Jumlah: ");
        int jumlah = Integer.parseInt(scan.nextLine());

        for (int jml = 1; jml <= jumlah; jml++){
            System.out.println(kata + " " + jml);
        }

    }
}

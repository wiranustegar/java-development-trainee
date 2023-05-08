import java.util.Scanner;

public class KomparasiApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("==========Komparasi App==============");

        System.out.print("Bilangan 1: ");
        int bil1 = Integer.parseInt(scan.nextLine());

        System.out.print("Bilangan 2: ");
        int bil2 = Integer.parseInt((scan.nextLine()));

        boolean hasilLebihKecil = bil1 < bil2;
        boolean hasilLebihKecilSd = bil1 <= bil2;
        boolean hasilLebihBesar = bil1 > bil2;
        boolean hasilLebihBesarSd = bil1 >= bil2;
        boolean hasilSd = bil1 == bil2;
        boolean tidakSd = bil1 != bil2;

        System.out.println(bil1 + ">" + bil2 + ": " + hasilLebihBesar);
        System.out.println(bil1 + ">=" + bil2 + ": " + hasilLebihBesarSd);
        System.out.println(bil1 + "<" + bil2 + ": " + hasilLebihKecil);
        System.out.println(bil1 + "<=" + bil2 + ": " + hasilLebihKecilSd);
        System.out.println(bil1 + "==" + bil2 + ": " + hasilSd);
        System.out.println(bil1 + "!=" + bil2 + ": " + tidakSd);

    }
}

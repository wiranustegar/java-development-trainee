import java.util.Scanner;

public class Palindrome {

    public static String balikKata(String kata){
        char ch;
        String balik ="";
        for (int i = 0; i < kata.length(); i++){
            ch = kata.charAt(i);
            balik = ch+balik;
        }

        return balik;
    }

    public static boolean bolakBalik(String kataOk){
        String balik = balikKata(kataOk);

        return balik.toLowerCase().equals(kataOk.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan kata ");
        String kata = sc.nextLine();
        System.out.println(bolakBalik(kata));

//        System.out.println("kata original: "+ kata);
////        System.out.print("Kata dibalik: ");
//        bolakBalik(kata);

    }
}

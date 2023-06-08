import java.util.Scanner;

public class ManipulasiString {

    static void balikString(String kata){
        char ch;
        String balik = "";

        for (int i = 0; i < kata.length(); i++){
            ch = kata.charAt(i);
            balik = ch+balik;
        }

        System.out.println(balik);
    }

    public static void main(String[] args) {
//        String kata = "ini adalah hari ke 19 training";
//
//        for (int i = 0; i < kata.length(); i++){
//            System.out.print(kata.charAt(i));
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan kata ");
        String kata = sc.nextLine();

        System.out.println("kata original: "+ kata);
        System.out.print("Kata dibalik: ");
        balikString(kata);

    }
}

public class CompareString {
    public static void main(String[] args) {

        String kata = "Kota Jakarta";
        String potong1 = "Kota ";
        String potong2 = "Jakarta";

        String gabungan = potong1 + potong2;

        System.out.println(kata);
        System.out.println(gabungan);
        System.out.println(kata==gabungan);
        System.out.println(kata.equals(gabungan));

    }
}

public class OperatorAritmatikaArgs {
    public static void main(String[] args) {

        java.util.Scanner tangkap = new java.util.Scanner(System.in);
        System.out.print("Bilangan Satu: ");

        double bilSatu = Double.parseDouble(tangkap.nextLine());
        System.out.print("Bialngan Dua: ");



        double bilDua = Double.parseDouble(tangkap.nextLine());

        double hasilJumlah = bilSatu + bilDua;
        double hasilKali = bilSatu * bilDua;
        double hasilBagi = bilSatu / bilDua;
        double hasilKurang = bilSatu - bilDua;
        double hasilModulus = bilSatu % bilDua;

        System.out.println("Hasil Penjumlahan: " + hasilJumlah);
        System.out.println("Hasil Perkalian: " + hasilKali);
        System.out.println("Hasil Pembagian: " + hasilBagi);
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Modulus: " + hasilModulus);

    }
}

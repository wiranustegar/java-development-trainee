public class MethodReturnValue {

    public static int kali(int a, int b){
        int hasil = a * b;
        return hasil;
    }

    public static int jumlah (int a, int b){
        int hasil = a + b;
        return hasil;
    }

    public static void main(String[] args) {

        //cara panggil pertama
        int hasilKali = kali(7,7);
        System.out.println(hasilKali);

        //cara panggil kedua
        System.out.println(kali(7,5));

        //cara panggil ketiga
        int jumlah = kali(7,5) + kali(7,5) * kali(5,1);
        System.out.println(jumlah);

        //METHOD YANG PUNYA RETURN VALUE, BISA DIJADIKAN PARAMETER UNTUK CALL METHOD LAIN
        int hasilJumlahKali = jumlah(kali(1,2), kali(2,1));
        System.out.println(hasilJumlahKali);
    }
}

public class MethodReturnLagi {

    public static String sambungDanBesarkanKata(String a, String b, String c){

        String hasil = a + " " + b + " " + c;
        return hasil.toUpperCase();

    }

    public static String [] ambilDaftarKota(){

        String [] kota = {"jkt", "bdg", "smg"};
        return kota;

    }

    public static void main(String[] args) {

        System.out.println(sambungDanBesarkanKata("Jakarta", "Sangat", "Indah"));

        String kata = sambungDanBesarkanKata("Bogor", "Lebih", "Indah");
        System.out.println(kata);

        String smg = sambungDanBesarkanKata("SEMARANG", "INDAH", "JUGA").toLowerCase();
        System.out.println(smg);

        String [] kota = ambilDaftarKota();
        MethodParameterArray.cetakArray(kota);

    }
}

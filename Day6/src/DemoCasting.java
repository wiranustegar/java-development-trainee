public class DemoCasting {
    public static void main(String[] args) {

        //CONTOH CASTING IMPLICIT PADA TYPE DATA PRIMITIVE
        byte a = 10;
        int b = a;

        //CONTOH CASTING EXPLICIT PADA TYPE DATA PRIMITIVE
        int c = 300;
        byte d = (byte) c;

        //Jika type kiri & kanan berbede, bisa dipastikan yg kiri adalah parent, yg kanan adalah turunan
        Kendaraan innova = new Mobil();
        innova.jalan();
        innova.berhenti();

        //CONTOH EXPLICIT CASTING DI TYPE DATA COMPLEX
        //explicit castin hanya bisa dialkukan dari parent ke turunan, TIDAK SEBALIKNYA
        ((Mobil)innova).mundur();

        Kendaraan ferrari = new MobilSport();
        ((MobilSport)ferrari).mundur();
        ((MobilSport) ferrari).ngebut();

        //JIKA DIBALIK AKAN ERROR
        //MobilSport porse = new Kendaraan();

        Motor mio = new Motor();
        Mobil ayla = new Mobil();
        MobilSport lambo = new MobilSport();

        //MANFAAT TYPE KIRI & KANAN BEDA
        //MANFAAT KE-1, MUDAH MENGGUNAKAN ARRAY
        Kendaraan [] daftarAsset = new Kendaraan[3];
        daftarAsset[0] = mio;
        daftarAsset[1] = ayla;
        daftarAsset[2] = lambo;

        for (int i = 0; i < daftarAsset.length; i++){
            if (daftarAsset[i] instanceof Motor){
                ((Motor) daftarAsset[i]).jumping();
            } else if (daftarAsset[i] instanceof MobilSport) {
                ((MobilSport) daftarAsset[i]).ngebut();
            } else if (daftarAsset[i] instanceof Mobil) {
                ((Mobil) daftarAsset[i]).mundur();
            }
        }

    }
}

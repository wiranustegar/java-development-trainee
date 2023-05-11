public class DemoKaryawan {

    public static void cetakData(Karyawan k){
        System.out.println("NIP = " + k.nip);
        System.out.println("NAMA = " + k.nama);
        System.out.println("GAJI = " + k.gaji);
        System.out.println("GOL DARAH = " + k.golDarah);
        System.out.println("STATUS = " + k.status);
    }

    //CONTOH METHOD DENGAN RETURN TYPE BERUPA TYPE DATA CUSTOM/COMPLEX/CLASS
    public static Karyawan buatKaryawan(String a, String b, double c, boolean d, char e){
        Karyawan z = new Karyawan();
        z.nip = a;
        z.nama = b;
        z.gaji = c;
        z.status = d;
        z.golDarah = e;

        return z;
    }

    public static void main(String[] args) {

//        Karyawan amir = new Karyawan();
//
//        amir.nip = "111";
//        amir.nama = "Amir Mahmud";
//        amir.gaji = 1000;
//        amir.golDarah = 'A';
//        amir.status = false;
//
//        cetakData(amir);
        Karyawan dedi = buatKaryawan("123", "Dedi", 2000, false, 'a');
        cetakData(dedi);

//        System.out.println("amir.nip = " + amir.nip);
//        System.out.println("amir.nama = " + amir.nama);
//        System.out.println("amir.gaji = " + amir.gaji);
//        System.out.println("amir.golDarah = " + amir.golDarah);
//        System.out.println("amir.status = " + amir.status);

    }
}

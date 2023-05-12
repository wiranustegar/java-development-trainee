import java.util.ArrayList;

public class DemoToString {
    public static void main(String[] args) {

        Mahasiswa adi = new Mahasiswa("111", "Adi", 3.3);
        Murid budi = new Murid("222","Budi",90);
        Karyawan joko = new Karyawan("123", "Joko", 7);

        ArrayList daftar = new ArrayList<>();
        daftar.add(adi);
        daftar.add(budi);
        daftar.add(joko);

        for (int i = 0; i < daftar.size(); i ++){
            System.out.println(daftar.get(i));
        }

//        System.out.println(adi);
//        System.out.println(budi);
//        System.out.println(joko);

    }
}

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        //MEMBUAT ARRAYLIST
        ArrayList<Murid> daftar = new ArrayList<Murid>();

        //MASUKKAN DATA KE ARRAYLIST
        Murid agus = new Murid("111","Agus Setiawan", 99);
        daftar.add(agus);
        daftar.add(new Murid("222","Amirudin", 88));

        //MELAKUKAN ITERASI & MENGAMBIL DATA DARI ARRAYLIST
        for (int i = 0; i < daftar.size(); i++){
            daftar.get(i).cetakData();
        }

        //MENGGUNAKAN INSTANCE OF
//        for (int i = 0; i < daftar.size(); i++){
//            Object z = daftar.get(i);
//            if (z instanceof Murid){
//                ((Murid)z).cetakData();
//            } else if (z instanceof Mahasiswa) {
//                ((Mahasiswa)z).cetakData();
//            } else if (z instanceof Karyawan) {
//                ((Karyawan)z).cetakData();
//            }
//        }

    }
}

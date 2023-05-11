public class DemoArrayKaryawan {

    public static void cetakArrayKaryawan(Karyawan []k){
        for (int i = 0; i < k.length; i++){
            DemoKaryawan.cetakData(k[i]);
        }
    }

    public static void main(String[] args) {

        Karyawan [] daftarKaryawan = new Karyawan[3];
        daftarKaryawan[0] = new Karyawan();
        daftarKaryawan[0].nip = "321";
        daftarKaryawan[0].nama = "Agus";
        daftarKaryawan[0].gaji = 2000;
        daftarKaryawan[0].status = true;
        daftarKaryawan[0].golDarah = 't';
        daftarKaryawan[1]=DemoKaryawan.buatKaryawan("444", "agus", 5000, true, 'g');
        daftarKaryawan[2]=DemoKaryawan.buatKaryawan("556", "eqo", 3000, true, 'g');

        //CETAK SEMUA KARYAWAN DENGAN LOOP

        cetakArrayKaryawan(daftarKaryawan);
    }
}

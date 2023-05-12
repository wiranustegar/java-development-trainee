public class PemrosesDataMain {
    public static void main(String[] args) {
        Murid agus = new Murid("111","Agus Setiawan", 99);
        PemrosesData<Murid> p = new PemrosesData<>(agus);
        p.showData().cetakData();

        Karyawan amir = new Karyawan("m123", "Amirudin",87);
        PemrosesData<Karyawan> k = new PemrosesData<>(amir);
        k.showData().cetakData();

        Mahasiswa dodo = new Mahasiswa("mh321", "Dododidu", 77);
        PemrosesData<Mahasiswa> m = new PemrosesData<>(dodo);
        m.showData().cetakData();
    }
}

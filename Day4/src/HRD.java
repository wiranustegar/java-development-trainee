public class HRD {
    public static void main(String[] args) {

        Domisili alamatAmir = new Domisili();
        alamatAmir.jalan = "jl kakap";
        alamatAmir.kelurahan = "Kelurahan Anu";

        Keluarga keluargaAmir = new Keluarga();
        keluargaAmir.istri = 1;
        keluargaAmir.anak = 2;

        Pendidikan pendidikanAmir = new Pendidikan();
        pendidikanAmir.sma = "SMA 48 jkt";
        pendidikanAmir.universitas = "Univ A";

        Pegawai amir = new Pegawai("111","Amirudin",alamatAmir,keluargaAmir, pendidikanAmir);


    }
}

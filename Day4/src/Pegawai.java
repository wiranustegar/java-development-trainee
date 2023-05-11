public class Pegawai {
    String nip;
    String nama;
    Domisili alamat;
    Keluarga anggotaKeluarga;
    Pendidikan riwayatPendidikan;

    public Pegawai(String nip, String nama, Domisili alamat, Keluarga anggotaKeluarga, Pendidikan riwayatPendidikan) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.anggotaKeluarga = anggotaKeluarga;
        this.riwayatPendidikan = riwayatPendidikan;
    }
}

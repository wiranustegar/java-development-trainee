public class Supervisor  extends Pegawai{
    public Supervisor(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    void mengawasiStaff(){
        System.out.println("Mengawasi Staff");
    }
}

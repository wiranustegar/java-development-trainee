public class Staff extends Pegawai {
    Staff(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    void kerja(){
        System.out.println("Kerja");
    }
}

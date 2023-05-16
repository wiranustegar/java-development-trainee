public class Direktur extends Pegawai {

    Direktur(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    void memberikanArahan(){
        System.out.println("Direktur Memberikan Arahan");
    }
}

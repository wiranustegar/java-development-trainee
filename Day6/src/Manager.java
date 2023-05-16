public class Manager extends Pegawai{
    Manager(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    void memanageSupervisor(){
        System.out.println("Memanage Supervisor");
    }
}

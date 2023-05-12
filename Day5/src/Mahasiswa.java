public class Mahasiswa {

    String nim;
    String nama;
    double ipk;

    public Mahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    void cetakData(){
        System.out.println("====MAHASISWA====");
        System.out.println("nim = " + nim);
        System.out.println("nama = " + nama);
        System.out.println("ipk = " + ipk);
    }

    public String toString(){
        return "Nama: " + nama + ", Nim: " + nim + ", IPK: " + ipk;
    }

}

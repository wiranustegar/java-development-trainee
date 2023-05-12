public class Karyawan {
    String nip;
    String nama;
    double kpi;

    public Karyawan(String nip, String nama, double kpi) {
        this.nip = nip;
        this.nama = nama;
        this.kpi = kpi;
    }

    void cetakData(){
        System.out.println("====KARYAWAN=====");
        System.out.println("nip = " + nip);
        System.out.println("nama = " + nama);
        System.out.println("kpi = " + kpi);
    }

    public String toString(){
        return "Ini adalah object dari Class Karyawan";
    }

}

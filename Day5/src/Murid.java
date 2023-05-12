public class Murid {
    String nisn;
    String nama;
    double nilai;

    public Murid(String nisn, String nama, double nilai) {
        this.nisn = nisn;
        this.nama = nama;
        this.nilai = nilai;
    }

    void cetakData(){
        System.out.println("=====MURID====");
        System.out.println("nisn = " + nisn);
        System.out.println("nama = " + nama);
        System.out.println("nilai = " + nilai);
    }

    public String toString(){
        return "Ini adalah object dari Class Murid";
    }

}

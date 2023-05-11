public class Murid {

    String nama, nim;

    double nilai;

    //INI ADALAH CONSTRUCTOR
//    public Murid(String nim, String b, double c){
//        this.nim = nim;
//        nama = b;
//        nilai = c;
//    }
    public Murid(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    //INI ADALAH CONSTRUCTOR OVERLOADING
    public Murid() {
        //CONTOH MELAKUKAN CALL ANTAR CONSTRUCTOR
        this("Anonim", "000", 0);
    }

    public Murid(String nama) {
        this("test", "000", 0);
        this.nama = nama;
    }
}

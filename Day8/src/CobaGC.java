public class CobaGC {
    int x;
    public static int diBuat = 0;
    public static int diHancurkan = 0;

    public CobaGC(int x) {
        diBuat++;
        this.x = x;
        System.out.println("Objec ke -" + this.x + ", dibuat");
    }

    @Override
    public void finalize(){
        diHancurkan++;
        System.out.println("Object ke -"+ this.x+", dihancurkan.........");
    }

    //di dalam finalize, kita disarankan melakukan "resource clean up"
    //contoh:
    //1. Menutup koneksi db
    //2. menutup file
    //dll

}
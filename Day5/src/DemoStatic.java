public class DemoStatic {

    public static void cetak(String s){
        System.out.println("s: " + s);
    }

    public void cetak2(){
        System.out.println("Ini nonstatic");
    }

    public static void main(String[] args) {
        cetak("test");
        DemoStatic.cetak("test2");

        //METHOD NON-STATIC HARUS DIPANGGIL VIA OBJECT
        DemoStatic d = new DemoStatic();
        d.cetak2();
    }
}

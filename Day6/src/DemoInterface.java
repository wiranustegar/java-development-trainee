public class DemoInterface {
    static void testBinatang(Binatang b){
        b.makan();
        b.bernafas();
    }

    public static void main(String[] args) {
        Ayam kampung = new Ayam();
        Sapi ternak = new Sapi();

        testBinatang(kampung);
        testBinatang(ternak);
    }
}

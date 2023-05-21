public class DemoInnerClass {
    public static void main(String[] args) {
        Luar l = new Luar();
        l.cetakLuar();

        Luar.Tengah t = l.new Tengah();
        t.cetakTengah();

        Luar.Tengah.Dalam d = t.new Dalam();
        d.cetakDalam();
    }
}

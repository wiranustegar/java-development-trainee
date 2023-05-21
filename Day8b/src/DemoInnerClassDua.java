public class DemoInnerClassDua {
    public static void main(String[] args) {
        LuarDua l = new LuarDua();
        Kakes t = l.new TengahDua();
        t.makan();

        Engineer d = ((LuarDua.TengahDua)t).new DalamDua();
        d.ngoding();
    }
}

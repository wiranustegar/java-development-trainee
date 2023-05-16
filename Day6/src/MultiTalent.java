public class MultiTalent {
    static void testManusia(Manusia m){
        m.makan();
    }

    static void testProgrammer(Programmer p){
        p.ngoding();
    }

    static void testSniper (Sniper s){
        s.nembak();
    }

    public static void main(String[] args) {
        Amir mahmud = new Amir();
        testManusia(mahmud);
        testSniper(mahmud);
        testProgrammer(mahmud);
    }
}

public class DemoGC {
    public static void main(String[] args) {
        for (int i = 0; i<1000000;i++){
            new CobaGC(i);
        }
        System.out.println("=======SUMARY=======");
        System.out.println("Total object dibuat "+ CobaGC.diBuat);
        System.out.println("Dihancurkan "+CobaGC.diHancurkan);
    }
}

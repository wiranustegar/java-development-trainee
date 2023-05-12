public class DemoClassGenericsMain {
    public static void main(String[] args) {

        DemoClassGenerics<String, Integer> x = new DemoClassGenerics<String, Integer>("aa",8);
        x.cetakProperties();
        x.setRoda("abcd");
        x.cetakProperties();
        System.out.println("Roda= " + x.roda);
//
//        DemoClassGenerics<Boolean, Double> y = new DemoClassGenerics<Boolean, Double>(true,4.5);
//        y.cetakProperties();

    }
}

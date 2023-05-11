public class DemoOverloading {

    public static void myMethod(){
        System.out.println("myMethod tanpa parameter");
    }

    public static void myMethod(String x, int y){
        System.out.println("x = " + x + " y = " + y);
    }

    public static void myMethod(int z, String w){
        System.out.println("z = " + z + " w = " + w);
    }

    public static void myMethod(String[] data){
        for (String x : data){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        myMethod();
        myMethod("aa",20);
        myMethod(30, "bb");
        String[] data = {"aa","bb"};
        myMethod(data);

    }

}

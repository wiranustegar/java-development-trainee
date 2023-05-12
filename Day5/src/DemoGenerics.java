public class DemoGenerics {

    public static <T> void cetak(T s){
        System.out.println(s);
    }

    public static <A, B> void coba2(A a, B b){
        System.out.println("a:" + a + " b: "+ b);
    }

    public static void main(String[] args) {
        cetak("test");
        cetak(10);
        coba2("aaa", 5);

        coba3(1,"bb", true);
    }

    public static <A, B, C> void coba3(A a, B b, C c){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a: " + a + " b: " + b + " c: " + " d:" +c);
    }

    public static <A, B, C, D> void coba4(A a, B b, C c, D d){

    }
}

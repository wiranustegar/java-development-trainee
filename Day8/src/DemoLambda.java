public class DemoLambda {

    public static void callMe(MyInterface x){
        System.out.println("===CALLME START===");
        x.coba();
        System.out.println("===CALL ME END===");
    }

    public static void main(String[] args) {
        //CARA NORMAL
        MyInterface a = new MyClass();
        a.coba();
        callMe(a);

        //CARA LAMBDA EXPRESSION MULTILINE
        MyInterface b = () -> {
            System.out.println("Ini Lambda 1");
            System.out.println("Ini Lambda 2");
            System.out.println("Ini Lambda 3");
        };
        b.coba();
        callMe(b);

        callMe(new MyClass());

        //CARA LAMBDA EXPRESSION SINGLE LINE
        callMe(() -> System.out.println("Ini Lambda"));


    }
}

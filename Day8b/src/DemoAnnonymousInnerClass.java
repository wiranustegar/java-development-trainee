public class DemoAnnonymousInnerClass {

    static void callMe(InterfaceKu x){
        x.test();
    }

    static InterfaceKu createMe(){
        return new InterfaceKu() {
            @Override
            public void test() {
                System.out.println("Ini Anonymous class dibikin dari return");
            }
        };
    }

    public static void main(String[] args) {
        InterfaceKu i1 = new ImplementorKu();
        i1.test();

        //MEMBUAT OBJECT DARI CLASS TANPA NAMA YG IMPLEMENT InterfaceKu
        InterfaceKu i2 = new InterfaceKu() {
            @Override
            public void test() {
                System.out.println("O..Yeah");
            }
        };
        i2.test();
        callMe(createMe());
        callMe(i1);
        callMe(i2);
        callMe(new InterfaceKu() {
            @Override
            public void test() {
                System.out.println("Ini Anonymous class dibikin dari parameter");
            }
        });
    }
}

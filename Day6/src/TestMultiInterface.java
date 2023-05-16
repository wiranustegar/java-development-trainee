public class TestMultiInterface {

    static void testMethod(Lima l){
        l.methodSatu();
        l.methodDua();
    }

    public static void main(String[] args) {
        Lima five = new Lima();
        testMethod(five);

    }
}

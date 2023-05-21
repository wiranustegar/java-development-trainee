import javax.jws.soap.SOAPBinding;

public class Outer {

    class Middle implements IOne {
        public void test(){
            System.out.println("Test");
        }

        class Inner extends Kendaraan{
            @Override
            void jalan() {
                System.out.println("Jalan");
            }
        }
    }



}

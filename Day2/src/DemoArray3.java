public class DemoArray3 {
    public static void main(String[] args) {
        
        //buatlah array dengan cara 2 & 3 dengan type boolean
        //array 1 : daftarLogic
        //array 2: daftarLogicLagi
        
        boolean daftarLogic[];
        daftarLogic = new boolean[3];
        daftarLogic[0] = true;
        daftarLogic[1] = 5<2;
        daftarLogic[2] = (true&&false);

        System.out.println("Jumlah Element = " + daftarLogic.length);
        System.out.println("daftarLogic[0] = " + daftarLogic[0]);
        System.out.println("daftarLogic[1] = " + daftarLogic[1]);
        System.out.println("daftarLogic[2] = " + daftarLogic[2]);


        boolean daftarLogicLagi[];
        daftarLogicLagi = new boolean[] {false, 2<10, (false||true)};

        System.out.println("Jumlah Element = " + daftarLogicLagi.length);
        System.out.println("daftarLogicLagi[0] = " + daftarLogicLagi[0]);
        System.out.println("daftarLogicLagi[1] = " + daftarLogicLagi[1]);
        System.out.println("daftarLogicLagi[2] = " + daftarLogicLagi[2]);
        
    }
}

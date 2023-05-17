public class DemoThrow {

    public static void bagi(int a, int b) throws Exception{
        if (b==0){
            throw new Exception("Error, pembagi = 0");
        } else {
            int hasil = a/b;
            System.out.println("Hasil: " + hasil);
        }
    }

    public static void main(String[] args) {
        try {
            bagi(10,0);
        } catch (Exception a){
            System.out.println(a.getMessage());
        }
    }
}

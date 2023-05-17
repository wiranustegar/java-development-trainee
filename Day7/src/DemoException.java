public class DemoException {
    public static void main(String[] args) {
        System.out.println("=====MULAI=====");
        try {
            int hasil = 10/5;
            System.out.println("Hasil Bagi: " + hasil);
            System.out.println("=====SELESAI=====");
            int [] angka = {10,20};
            System.out.println(angka[3]);
        } catch (ArithmeticException e1){
            System.out.println("Terjadi pembagian error " + e1.getMessage());
        } catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Terjadi error pada array " + e2.getMessage());
        } catch (Exception ex){
            System.out.println("Ada error lain " + ex.getMessage());
        }
        finally {
            System.out.println("Error/tidak tetaap jalan");
        }
    }
}

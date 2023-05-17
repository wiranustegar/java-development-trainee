public class Kakek extends Buyut {
    public Kakek(String w, int k) {
        //keyword SUPER untuk passing parameter turunan wajib passing ke parent.
        //1. HARUS dilakukan dari constructor turunan (TIDAK BOLEH DARI METHOD)
        //2. harus dilakukan di baris paling atas di sebuah constructor
        //3. dalam SEBUAH constructor, hanya bisa memanggil super(..) 1x saja
        super(w, k);
        System.out.println("Object Kakek dicreate");
    }
}

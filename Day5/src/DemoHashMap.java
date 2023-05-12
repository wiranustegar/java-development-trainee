import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {

        HashMap <String, Mahasiswa> daftar = new HashMap<String, Mahasiswa>();

        daftar.put("amir", new Mahasiswa("111", "Amirudin", 3.4));
        daftar.put("budi", new Mahasiswa("222", "Budi Seti", 3.1));
        daftar.put("cahya", new Mahasiswa("333", "Cahya", 2.3));

        System.out.println("NIM: "+ daftar.get("amir").nim);
        System.out.println("NAMA: "+ daftar.get("amir").nama);
        System.out.println("IPK: "+daftar.get("amir").ipk);

        Mahasiswa budi = daftar.get("budi");
        System.out.println("NIM: " + budi.nim);
        System.out.println("NAMA " + budi.nama);
        System.out.println("IPK " + budi.ipk);

        //MELIHAT DAFTAR KEY
        System.out.println(daftar.keySet());

        //MELAKUKAN ITERASI HASHMAP
        for (String key : daftar.keySet()){
            System.out.println("==========");
            System.out.println("NIM: " + daftar.get(key).nim);
            System.out.println("NAMA " + daftar.get(key).nama);
            System.out.println("IPK " + daftar.get(key).ipk);

        }
    }
}

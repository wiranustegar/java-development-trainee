import java.util.Scanner;

public class TokoKelontong {

    public Barang pilihBarang(String pilihanMenu, Barang[] daftar){
        if (pilihanMenu.equals("1")){
            return daftar[0];
        } else if (pilihanMenu.equals("2")) {
            return daftar[1];
        }
        return daftar[2];
    }

    public static void prosesBarang(Barang[] daftar){

        Scanner scan = new Scanner(System.in);

        System.out.println("=====MENU======");
        for (int i = 0; i < daftar.length; i++){
            System.out.println((i+1)+"). "+daftar[i].nama);
        }
        System.out.println("4). Keluar");

        System.out.print("Pilihan anda: [1/2/3/4]");
        String pilihanMenu = scan.nextLine();
        if (pilihanMenu.equals("1")){

        } else if (pilihanMenu.equals("2")) {

        } else if (pilihanMenu.equals("3")) {

        } else if (pilihanMenu.equals("4")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        Barang [] daftarBarang = new Barang[3];
        daftarBarang[0] = new Barang("001", "Pulpen",1000,100);
        daftarBarang[1] = new Barang("002", "Buku",2000,100);
        daftarBarang[2] = new Barang("003", "Pensil",500,100);

        prosesBarang(daftarBarang);
    }
}

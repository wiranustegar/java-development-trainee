import java.util.Scanner;

public class UjianEnum {
    public enum Kendaraan{
        MOBIL, SEPEDA, BAJAJ, DELMAN
    }

    public static Kendaraan tebakJenisKendaraan (int rodaDepan, int rodaBelakang){

        if (rodaDepan == 2 && rodaBelakang == 2){
            return Kendaraan.MOBIL;
        } else if (rodaDepan == 1 && rodaBelakang == 1) {
            return Kendaraan.SEPEDA;
        } else if (rodaDepan == 1 && rodaBelakang == 2) {
            return Kendaraan.BAJAJ;
        } else if (rodaDepan == 0 && rodaBelakang == 2) {
            return Kendaraan.DELMAN;
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Roda depan: ");
        int rd = Integer.parseInt(sc.nextLine());
        System.out.print("Roda belakang: ");
        int rb = Integer.parseInt(sc.nextLine());

        System.out.println(tebakJenisKendaraan(rd,rb));

//        System.out.println(tebakJenisKendaraan(rd,rb));
    }
}

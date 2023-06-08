public class DemoEnum {
    public enum Hari{
        SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
    }

    public static Hari getNamaHari(int nomorHari){
        if (nomorHari == 1){
            return Hari.MINGGU;
        } else if (nomorHari == 2) {
            return Hari.SENIN;
        } else if (nomorHari == 3) {
            return Hari.SELASA;
        } else if (nomorHari == 4) {
            return Hari.RABU;
        } else if (nomorHari == 5) {
            return Hari.KAMIS;
        } else if (nomorHari == 6) {
            return Hari.JUMAT;
        }

        return Hari.SABTU;
    }

    public static void main(String[] args) {
        System.out.println(getNamaHari(1));
        System.out.println(getNamaHari(2));
        System.out.println(getNamaHari(3));
        System.out.println(getNamaHari(4));
        System.out.println(getNamaHari(5));
        System.out.println(getNamaHari(6));
        System.out.println(getNamaHari(7));
    }
}

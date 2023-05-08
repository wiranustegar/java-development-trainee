public class DemoArray {
    public static void main(String[] args) {

        String namaKota [] = {"Jakarta", "Bandung", "Semarang"};

        //memgetahui jumlah element
        System.out.println("Jumlah kota: "+ namaKota.length);

        //index terendah adalah 0
        System.out.println("namaKota[0]: " + namaKota[0]);
        System.out.println("namaKota[1]: " + namaKota[1]);
        System.out.println("namaKota[2]: " + namaKota[2]);

        //Melampaui batas (ArrayIndexOutOfBoundsException)
        //System.out.println("namaKota[2]: " + namaKota[3]);

        int [] daftarNilai = {90, 80, 70, 60, 50, (80-7)};
        double [] daftarPecahan = {1.2, 13.3, 3.4};
        char [] daftarHuruf = {'a', 'b', 'c', 'd'};
        boolean [] daftarLogika = {true, (6<9), (true||((8>9)&&(7>2))), "bandung".equals("jakarta")};

        System.out.println("Daftar nilai[0]: " + daftarNilai[0]);
        System.out.println("Daftar nilai[1]: " + daftarNilai[1]);
        System.out.println("Daftar nilai[2]: " + daftarNilai[2]);
        System.out.println("Daftar nilai[3]: " + daftarNilai[3]);
        System.out.println("Daftar nilai[4]: " + daftarNilai[4]);
        System.out.println("Daftar nilai[5]: " + daftarNilai[5]);

        System.out.println("Daftar Pecahan[0]" + daftarPecahan[0]);
        System.out.println("Daftar Pecahan[1]" + daftarPecahan[1]);
        System.out.println("Daftar Pecahan[2]" + daftarPecahan[2]);

        System.out.println("DaftarHuruf[0]" + daftarHuruf[0]);
        System.out.println("DaftarHuruf[1]" + daftarHuruf[1]);
        System.out.println("DaftarHuruf[2]" + daftarHuruf[2]);
        System.out.println("DaftarHuruf[3]" + daftarHuruf[3]);

        System.out.println("DaftarLogika[0]" + daftarLogika[0]);
        System.out.println("DaftarLogika[1]" + daftarLogika[1]);
        System.out.println("DaftarLogika[2]" + daftarLogika[2]);
        System.out.println("DaftarLogika[3]" + daftarLogika[3]);

    }
}

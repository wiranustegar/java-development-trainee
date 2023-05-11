public class Barang {
    String kode;
    String nama;
    double harga;
    int stok;

    public Barang(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    //CONTOH METHOD DI DALAM CLASS
    public boolean cekBarang(int jumlahYangAkanDiambil){
        if (stok >= jumlahYangAkanDiambil){
            return true;
        }
        return false;
    }

    public int cekStok(){
        return stok;
    }

    public void jual(int jumlah){
        if (cekBarang(jumlah)){
            stok -= jumlah;
        } else {
            System.out.println("Maaf, stok kurang");
        }
    }
}

public class Bank2 {
    public static void main(String[] args) {

        Tabungan amir = new Tabungan("001", "Amir", 1000);
        Tabungan budi = new Tabungan("002", "Budi", 5000);
        amir.cekSaldo();
        budi.cekSaldo();
        Tabungan.tutupKantor();
        amir.cekSaldo();
        budi.cekSaldo();
        Tabungan.bukaKantor();
        amir.cekSaldo();
        budi.cekSaldo();

    }
}

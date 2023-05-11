public class Bank {
    public static void main(String[] args) {

        Tabungan amir = new Tabungan("001", "Amir", 1000);
        amir.cekSaldo();
        amir.tarik(10);
        amir.cekSaldo();
        amir.setor(1000);
        amir.cekSaldo();

        Tabungan budi = new Tabungan("002", "Budi", 5000);
        budi.cekSaldo();
        budi.tarik(200);
        budi.cekSaldo();
        amir.cekSaldo();

    }
}

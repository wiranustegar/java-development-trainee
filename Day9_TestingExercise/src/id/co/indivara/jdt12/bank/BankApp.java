package id.co.indivara.jdt12.bank;

public class BankApp {
    String norek;
    int saldo;

    public String bukaRekening(String norek, int saldoAwal){
        this.saldo = saldoAwal;
        this.norek = norek;
        return norek;
    }

    public int cekSaldo(String norek){
        return saldo;
    }

    public int tarik(int jumlah){
        saldo -= jumlah;
        return saldo;
    }

    public int setor(int jumlah){
        saldo += jumlah;
        return saldo;
    }
}

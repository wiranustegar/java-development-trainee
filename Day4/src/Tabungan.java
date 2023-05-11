public class Tabungan {
    private String norek;
    private String nama;
    private double saldo;
    private static boolean bankOnline = true;

    public static void bukaKantor(){
        bankOnline = true;
    }

    public static void tutupKantor(){
        bankOnline = false;
    }

    public Tabungan(String norek, String nama, double saldo) {
        this.norek = norek;
        this.nama = nama;
        this.saldo = saldo;
    }

    public void cekSaldo(){
        if (bankOnline){
            System.out.println("Bapak/ibu " + nama+ ", Saldo anda saat ini: "+saldo);
        } else {
            System.out.println("SERVER SEDANG OFFLINE");
        }
    }

    public void setor(double jumlah){
        if (bankOnline){
            saldo += jumlah;
        }else {
            System.out.println("SERVER SEDANG OFFLINE");
        }
    }
    public void tarik(double jumlah){
        if (bankOnline){
            if (jumlah <= saldo){
                saldo -= jumlah;
            } else {
                System.out.println("Bapak/ibu " + nama+ ", Saldo anda kurang");
            }
        } else {
            System.out.println("SERVER SEDANG OFFLINE");
        }
    }
}

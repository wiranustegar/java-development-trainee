import java.util.Scanner;

public class WarungBakso {

    public static void tampilkanMenu(){
        System.out.println("===========MENU==============");
        System.out.println("1). MIE AYAM - Rp10.000");
        System.out.println("2). BAKSO - Rp15.000");
        System.out.println("3). MIE AYAM BAKSO - Rp25.000");

    }

    public static int [] inputPesanan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("===INPUT PESANAN=====");
        System.out.print("Jumlah: ");
        int jumlah = Integer.parseInt(scan.nextLine());
        int pesanan [] = new int[jumlah];

        for (int i = 0; i < pesanan.length; i++){
            System.out.print("Pilih 1/2/3?: ");
            pesanan[i] = Integer.parseInt(scan.nextLine());
        }
        return pesanan;
    }

    public static int cekHarga(int kode){
        if(kode==1){
            return 10000;
        }else if(kode==2){
            return 15000;
        }
        return 25000;
    }

    public static String cekBarang(int kode){
        if(kode==1){
            return "Mie Ayam";
        }else if(kode==2){
            return "Bakso";
        }
        return "Mie Ayam Bakso";
    }

    public static void ringkasanPesanan(int[] data){
        int subtotal = 0;
        for (int i = 0; i < data.length; i++){
            System.out.println("Pesanan " + (i+1) + ": " + cekBarang(data[i]));
            subtotal += cekHarga(data[i]);
        }
        System.out.println("TOTAL BAYAR: " + subtotal);
        System.out.println("==================");

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            tampilkanMenu();
            int dataPesanan[] = inputPesanan();
            ringkasanPesanan(dataPesanan);

            while (true){
                System.out.print("Lagi? = ");
                String lagi = scan.nextLine().toLowerCase();
                if (!lagi.equals("y")&&(!lagi.equals("t"))){
                    System.out.println("Masukkan Y atau T saja !!!!");
                    continue;
                } else if (lagi.equals("y")){
                    break;
                } else if (lagi.equals("t")) {
                    System.exit(0);
                }
            }
        }


    }

}

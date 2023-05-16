import java.util.ArrayList;
import java.util.Scanner;

public class HRDApp {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Pegawai> p = new ArrayList<>();

    private static void showMenu(){
        System.out.println("=====================");
        System.out.println("1). Entry data Direktur");
        System.out.println("2). Entry data manager");
        System.out.println("3). Entry data SuperVisor");
        System.out.println("4). Entry data Staff");
        System.out.println("5). Tampilkan Semua data");
        System.out.println("6). Exit");
    }

    private static void processMenu(){
        showMenu();
        while(true){
            System.out.print("Pilihan [1/2/3/4/5/6]: ");
            int pilihan = Integer.parseInt(sc.nextLine());

            switch (pilihan){
                case 5:
                    showData();
                    break;
                case 6:
                    System.out.println("Good bye");
                    System.exit(0);
                default:
                    inputData(pilihan);
                    break;

            }
        }
    }

    private static void inputData(int pilihan){
        if(pilihan > 4){
            System.out.println("Choose 1, 2, 3 or 4 only");
        } else{
            System.out.print("Nip: ");
            String nip = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("gaji: ");
            double gaji = Double.parseDouble(sc.nextLine());

            switch (pilihan){
                case 1:
                    p.add(new Direktur(nip, nama, gaji));
                    break;
                case 2:
                    p.add(new Manager(nip, nama, gaji));
                    break;
                case 3:
                    p.add(new Supervisor(nip, nama, gaji));
                    break;
                case 4:
                    p.add(new Staff(nip, nama, gaji));
                    break;
            }
        }
    }

    private static void showData(){
        for(Pegawai k: p){
            if(k instanceof Direktur){
                System.out.println("=====DATA DIREKTUR=====");
                k.tampilkanProperties();
                ((Direktur) k).memberikanArahan();
            } else if (k instanceof  Manager) {
                System.out.println("=====DATA MANAGER=====");
                k.tampilkanProperties();
                ((Manager) k).memanageSupervisor();
            } else if(k instanceof Supervisor){
                System.out.println("=====DATA SUPERVISOR=====");
                k.tampilkanProperties();
                ((Supervisor) k).mengawasiStaff();
            } else if(k instanceof Staff){
                System.out.println("=====DATA STAFF=====");
                k.tampilkanProperties();
                ((Staff) k).kerja();
            }
        }
    }

    public static void main(String[] args) {
        processMenu();
    }
}
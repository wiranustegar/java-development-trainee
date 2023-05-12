import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ExerciseHashMap {

    public static void inputData(Scanner scan, HashMap<String, Mahasiswa> m){
        System.out.print("NIM:");
        String nim = scan.nextLine();
        System.out.print("NAMA:");
        String nama = scan.nextLine();
        System.out.print("IPK:");
        double ipk=Double.parseDouble(scan.nextLine());
        m.put(nim ,new Mahasiswa(nim,nama,ipk));
    }

    public static void showData(HashMap<String, Mahasiswa> m){
        for(String key : m.keySet()){
            System.out.println("------");
            System.out.println("NIP:"+m.get(key).nim);
            System.out.println("NAMA:"+m.get(key).nama);
            System.out.println("IPK:"+m.get(key).ipk);
        }
    }

    public static void ringkasan(HashMap<String, Mahasiswa> m){
            System.out.println(m.keySet());
    }

    public static void detail( Scanner scan, HashMap<String, Mahasiswa> m){
        System.out.println("Masukkan key: ");
        String key = scan.nextLine();
        Mahasiswa mhs = m.get(key);
        System.out.println("------");
        System.out.println("NIP:"+m.get(key).nim);
        System.out.println("NAMA:"+m.get(key).nama);
        System.out.println("IPK:"+m.get(key).ipk);

    }
    public static void tampilkanMenu(Scanner s,HashMap<String, Mahasiswa> m){
        System.out.println("==========MENU==========");
        System.out.println("1). Entry Data Mahasiswa");
        System.out.println("2). Lihat Data Mahasiswa");
        System.out.println("3). Ringkasan Data Mahasiswa");
        System.out.println("4). Detail Data Mahasiswa");
        System.out.println("pilihan anda [1/2/3]?:");
        int pilihan=Integer.parseInt(s.nextLine());
        if(pilihan==1){
            inputData(s,m);
        }else if(pilihan==2){
            showData(m);
        }else if(pilihan==3){
            ringkasan(m);
        } else if (pilihan==4) {
            detail(s, m);
        }else if (pilihan==5){
            System.exit(0);
        }
    }


    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        HashMap <String, Mahasiswa> m=new HashMap<>();
        while(true){
            tampilkanMenu(s,m);
        }
    }

}

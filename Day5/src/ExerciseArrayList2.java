import java.util.*;

public class ExerciseArrayList2 {
    public static void inputData(Scanner s,ArrayList<Mahasiswa> m){
        System.out.print("NIM:");
        String nim=s.nextLine();
        System.out.print("NAMA:");
        String nama=s.nextLine();
        System.out.print("IPK:");
        double ipk=Double.parseDouble(s.nextLine());
        m.add(new Mahasiswa(nim,nama,ipk));
    }

    public static void showData(ArrayList<Mahasiswa> m){
        for(int x=0;x<m.size();x++){
            System.out.println("------");
            System.out.println("NIP:"+m.get(x).nim);
            System.out.println("NAMA:"+m.get(x).nama);
            System.out.println("IPK:"+m.get(x).ipk);
        }
    }
    public static void tampilkanMenu(Scanner s,ArrayList<Mahasiswa> m){
        System.out.println("==========MENU==========");
        System.out.println("1). Entry Data Mahasiswa");
        System.out.println("2). Lihat Data Mahasiswa");
        System.out.println("3). Keluar");
        System.out.println("pilihan anda [1/2/3]?:");
        int pilihan=Integer.parseInt(s.nextLine());
        if(pilihan==1){
            inputData(s,m);
        }else if(pilihan==2){
            showData(m);
        }else if(pilihan==3){
            System.exit(0);
        }
    }

    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        ArrayList <Mahasiswa> m=new ArrayList<Mahasiswa>();
        while(true){
            tampilkanMenu(s,m);
        }
    }
}
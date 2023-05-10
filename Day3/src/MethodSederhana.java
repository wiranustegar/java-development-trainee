public class MethodSederhana {
    public static void cetakBiodata(String nama, int umur, String alamat){
        System.out.println("nama = " + nama);
        System.out.println("umur = " + umur);
        System.out.println("alamat = " + alamat);
        System.out.println("-----------------");
    }

    public static void predikatNilai(String nilai){

        switch (nilai){
            case "a":
                System.out.print("Nilai anda A,Excellent");
                break;
            case "b":
                System.out.print("Good");
                break;
            case "c":
                System.out.print("Fair");
                break;
            case "d":
                System.out.print("bad");
                break;
            case "e":
                System.out.print("Not passed");
                break;
        }




    }

    public static void main(String[] args) {

        predikatNilai("a");
        predikatNilai("b");
        predikatNilai("c");

    }
}

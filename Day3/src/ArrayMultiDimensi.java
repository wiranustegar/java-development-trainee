public class ArrayMultiDimensi {
    public static void main(String[] args) {

        String daftar[][] = new String[2][3];

        daftar[0][0] = "Amir";
        daftar[0][1] = "Budi";
        daftar[0][2] = "Carlie";

        daftar[1][0] = "Dedi";
        daftar[1][1] = "Eri";
        daftar[1][2] = "Fikry";

        for (int i = 0; i < daftar.length; i++){
            for (int x = 0; x < daftar[i].length; x++){
                System.out.println(daftar[i][x]);
            }
        }

    }
}

public class MethodParameterArray {

    public static void cetakArray(String daftar[]){
        for (int i = 0; i < daftar.length; i++){
            System.out.println(daftar[i]);
        }

        System.out.println("------------");
    }

    public static void main(String[] args) {

        String daftarKota[] = {"Jakarta", "Bandung", "Semarang"};
        cetakArray(daftarKota);

        String daftarNama[] = {"Ando", "dodo", "Saida", "Saidi"};
        cetakArray(daftarNama);

    }
}

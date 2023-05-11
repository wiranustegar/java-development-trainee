public class DemoConstructor {

    public static void cetakData(Murid m){
        System.out.println("NIM: " + m.nim);
        System.out.println("NAMA = " + m.nama);
        System.out.println("NILAI = " + m.nilai);
        System.out.println("====================");
    }

    public static void main(String[] args) {

        Murid iwan = new Murid("001", "Iwan", 78);
        Murid saida = new Murid("002", "Saida", 69);
        Murid andi = new Murid();
        Murid dodo = new Murid("dodo");

        cetakData(iwan);
        cetakData(saida);
        cetakData(andi);
        cetakData(dodo);

    }
}

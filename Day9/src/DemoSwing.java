import javax.swing.*;
import java.awt.*;

public class DemoSwing {

    JFrame figura;
    Container kanvas;
    JTextField teks;
    JButton btnIsi, btnHapus;
    DemoSwing(){
        //MEMBUAT FRAME
        figura = new JFrame("Ini Judul");

        //MEMBUAT KANVAS YG MENEMPEL PADA FRAME
        kanvas = figura.getContentPane();

        //KANVAS HARUS DI SET LAYOUTNYA, AGAR KITA BISA MENEMPEL KOMPONEN DI ATASNYA
        //FLOW LAYOUT akan meletakkan komponen dengan urutan dari kiri ke kanan
        kanvas.setLayout(new FlowLayout());

        //BUAT OBJECT2 YANG AKAN DITEMPEL DI KANVAS
        teks = new JTextField(35);
        btnIsi = new JButton("ISI");
        btnHapus = new JButton("HAPUS");

        //TEMPEL SEMUA OBJECT KE KANVAS
        kanvas.add(teks);
        kanvas.add(btnIsi);
        kanvas.add(btnHapus);

        //ATUR UKURAN FIGURE
//        figura.setSize(700,100);
        figura.pack();
        figura.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        figura.setVisible(true);
    }

    public static void main(String[] args) {
        new DemoSwing();
    }
}

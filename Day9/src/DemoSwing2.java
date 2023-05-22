import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoSwing2 extends JFrame {
    Container kanvas;
    JTextField teks;
    JButton btnIsi, btnHapus, btnLagi;

    class AksiBtnIsi implements ActionListener{
        public void actionPerformed(ActionEvent e){
            teks.setText("Tombol Isi diklik");
        }
    }

    DemoSwing2(){
        super("Ini Judul");
        kanvas = getContentPane();
        kanvas.setLayout(new FlowLayout());

        //INNER CLASS BIASA
        teks = new  JTextField(35);
        btnIsi = new JButton("ISI");
        btnIsi.addActionListener(new AksiBtnIsi());

        //ANONYMOUS CLASS
        btnHapus = new JButton("HAPUS");
        btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teks.setText("");
            }
        });

        //LAMBDA EXPRESSION
        btnLagi = new JButton("ISI LAGI");
        btnLagi.addActionListener((ActionEvent) -> teks.setText("ISI LAGI"));

        kanvas.add(teks);
        kanvas.add(btnIsi);
        kanvas.add(btnHapus);
        kanvas.add(btnLagi);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new  DemoSwing2();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoSwing3 extends JFrame {
    Container kanvas;
    JTextField teks;
    JButton btnIsi, btnHapus, btnLagi;

    class ActionUntukButton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource().equals(btnIsi)){
                teks.setText("ISI");
            } else if (e.getSource().equals(btnHapus)) {
                teks.setText("");
            } else if (e.getSource().equals(btnLagi)) {
                teks.setText("ISI LAGI");
            }
        }
    }

    DemoSwing3(){
        super("Ini Judul");
        kanvas = getContentPane();
        kanvas.setLayout(new FlowLayout());

        //INNER CLASS BIASA
        teks = new  JTextField(35);
        btnIsi = new JButton("ISI");
        btnIsi.addActionListener(new ActionUntukButton());

        btnHapus = new JButton("HAPUS");
        btnHapus.addActionListener(new ActionUntukButton());

        btnLagi = new JButton("ISI LAGI");
        btnLagi.addActionListener(new ActionUntukButton());

        kanvas.add(teks);
        kanvas.add(btnIsi);
        kanvas.add(btnHapus);
        kanvas.add(btnLagi);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new  DemoSwing3();
    }
}

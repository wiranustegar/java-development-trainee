import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoSwing4 extends JFrame implements ActionListener{
    Container kanvas;
    JTextField teks;
    JButton btnIsi, btnHapus, btnLagi;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnIsi)){
            teks.setText("ISI");
        } else if (e.getSource().equals(btnHapus)) {
            teks.setText("");
        } else if (e.getSource().equals(btnLagi)) {
            teks.setText("ISI LAGI");
        }
    }

    DemoSwing4(){
        super("Ini Judul");
        kanvas = getContentPane();
        kanvas.setLayout(new FlowLayout());

        teks = new  JTextField(35);
        btnIsi = new JButton("ISI");
        btnIsi.addActionListener(this);

        btnHapus = new JButton("HAPUS");
        btnHapus.addActionListener(this);

        btnLagi = new JButton("ISI LAGI");
        btnLagi.addActionListener(this);

        kanvas.add(teks);
        kanvas.add(btnIsi);
        kanvas.add(btnHapus);
        kanvas.add(btnLagi);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new  DemoSwing4();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaculatorSwing extends JFrame implements ActionListener {
    Container kanvas;
    JTextField textField1,textField2, textFieldHasil;
    JButton btnTambah, btnKali, btnBagi, btnKurang, btnClear;

    @Override
    public void actionPerformed(ActionEvent e) {
        int bil1Value = Integer.parseInt(textField1.getText());
        int bil2Value = Integer.parseInt(textField2.getText());

        if (e.getSource().equals(btnTambah)){
            int tambah = bil1Value + bil2Value;
            textFieldHasil.setText(String.valueOf(tambah));
        } else if (e.getSource().equals(btnKali)) {
            int kali = bil1Value * bil2Value;
            textFieldHasil.setText(String.valueOf(kali));
        } else if (e.getSource().equals(btnBagi)) {
            int bagi = bil1Value/bil2Value;
            textFieldHasil.setText(String.valueOf(bagi));
        } else if (e.getSource().equals(btnKurang)) {
            int kurang = bil1Value-bil2Value;
            textFieldHasil.setText(String.valueOf(kurang));
        } else if (e.getSource().equals(btnClear)) {
            textField1.setText("");
            textField2.setText("");
            textFieldHasil.setText("");
        }
    }

    CaculatorSwing(){
        super("Calculator");
        kanvas = getContentPane();
        kanvas.setLayout(new FlowLayout());

        textField1 = new  JTextField(10);
        textField2 = new  JTextField(10);
        textFieldHasil = new  JTextField(10);

        btnTambah = new JButton("+");
        btnTambah.addActionListener(this::actionPerformed);

        btnKali = new JButton("x");
        btnKali.addActionListener(this::actionPerformed);

        btnBagi = new JButton("%");
        btnBagi.addActionListener(this::actionPerformed);

        btnKurang = new JButton("-");
        btnKurang.addActionListener(this::actionPerformed);

        btnClear = new JButton("C");
        btnClear.addActionListener(this::actionPerformed);

        kanvas.add(textField1);
        kanvas.add(textField2);
        kanvas.add(textFieldHasil);
        kanvas.add(btnKali);
        kanvas.add(btnTambah);
        kanvas.add(btnKurang);
        kanvas.add(btnBagi);
        kanvas.add(btnClear);


        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new  CaculatorSwing();
    }
}

import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;
import java.awt.*;
import java.awt.event.*;

public class StopwatchSwing2 extends JFrame implements ActionListener{
    Container c;
    JTextField txtSecond,txtMilliSecond,txtMicroSecond;
    JButton btnStart,btnStop,btnReset;
    int second,milliSecond,microSecond;
    boolean play;

    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnStart)){
            play=true;
        }else if(e.getSource().equals(btnStop)){
            play=false;
        }else if(e.getSource().equals(btnReset)){
            play=false;
            second=0;
            milliSecond=0;
            microSecond=0;
            txtSecond.setText(String.valueOf(second));
            txtMilliSecond.setText(String.valueOf(milliSecond));
            txtMicroSecond.setText(String.valueOf(milliSecond));
        }
    }


    class Detik extends Thread{
        public void run(){
            while(true){
                try{
                    if(play){
                        second++;
                        txtSecond.setText(String.valueOf(second));
                    }
                    Thread.sleep(1000);
                }catch(Exception ex){
                    ex.printStackTrace();
                }

            }
        }
    }

    class MiliDetik extends Thread{
        public void run(){
            while(true){
                try{
                    if(play){
                        milliSecond++;
                        txtMilliSecond.setText(String.valueOf(milliSecond));
                    }
                    Thread.sleep(100);
                }catch(Exception ex){
                    ex.printStackTrace();
                }

            }
        }
    }

    class MikroDetik extends Thread{
        public void run(){
            while(true){
                try{
                    if(play){
                        microSecond++;
                        txtMicroSecond.setText(String.valueOf(microSecond));
                    }
                    Thread.sleep(10);
                }catch(Exception ex){
                    ex.printStackTrace();
                }

            }
        }
    }

    StopwatchSwing2(){
        super("Stop Watch Swing");
        c=getContentPane();
        c.setLayout(new FlowLayout());

        btnStart=new JButton("START");
        btnStop=new JButton("STOP");
        btnReset=new JButton("RESET");
        txtSecond=new JTextField(25);
        txtMilliSecond=new JTextField(25);
        txtMicroSecond=new JTextField(25);

        btnStart.addActionListener(this);
        btnStop.addActionListener(this);
        btnReset.addActionListener(this);

        c.add(txtSecond);
        c.add(txtMilliSecond);
        c.add(txtMicroSecond);
        c.add(btnStart);
        c.add(btnStop);
        c.add(btnReset);

        new Detik().start();
        new MiliDetik().start();
        new MikroDetik().start();

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String [] args){
        new StopwatchSwing2();
    }
}
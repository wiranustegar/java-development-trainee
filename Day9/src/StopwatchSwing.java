import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopwatchSwing extends JFrame implements ActionListener,Runnable{
    Container c;
    JTextField teks;
    JButton btnStart,btnStop,btnReset;
    int counter;
    boolean play;

    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnStart)){
            play=true;
        }else if(e.getSource().equals(btnStop)){
            play=false;
        }else if(e.getSource().equals(btnReset)){
            play=false;
            counter=0;
            teks.setText(String.valueOf(counter));
        }
    }

    public void run(){
        muter();
    }

    public void muter(){
        while(true){
            try{
                if(play){
                    counter++;
                    teks.setText(String.valueOf(counter));
                }
                Thread.sleep(1000);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }

    StopwatchSwing(){
        super("Stop Watch Swing");
        c=getContentPane();
        c.setLayout(new FlowLayout());

        btnStart=new JButton("START");
        btnStop=new JButton("STOP");
        btnReset=new JButton("RESET");
        teks=new JTextField(25);

        btnStart.addActionListener(this);
        btnStop.addActionListener(this);
        btnReset.addActionListener(this);

        c.add(teks);
        c.add(btnStart);
        c.add(btnStop);
        c.add(btnReset);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String [] args){
        //new Thread(new StopWatchSwing()).start();
        Thread t=new Thread(new StopwatchSwing());
        t.start();
    }
}
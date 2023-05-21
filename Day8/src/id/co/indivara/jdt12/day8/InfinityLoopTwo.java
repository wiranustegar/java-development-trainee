package id.co.indivara.jdt12.day8;

public class InfinityLoopTwo extends Thread{
    public void muter(){
        while (true){
            try {
                System.out.println("...Dua");
                Thread.sleep(1000);
            } catch (Exception ex){
                System.out.println(ex);
            }
        }
    }

    public void run(){
        muter();
    }
}

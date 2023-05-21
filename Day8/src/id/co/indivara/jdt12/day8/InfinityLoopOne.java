package id.co.indivara.jdt12.day8;

public class InfinityLoopOne extends Thread {
    public void muter(){
        while (true){
            try {
                System.out.println("Satu...");
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

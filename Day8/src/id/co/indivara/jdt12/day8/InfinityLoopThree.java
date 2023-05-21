package id.co.indivara.jdt12.day8;

public class InfinityLoopThree extends Thread {
    public void muter(){
        while (true){
            try {
                System.out.println("..Tiga..");
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println(e);
            }
        }


    }
    public void run(){
        muter();
    }
}

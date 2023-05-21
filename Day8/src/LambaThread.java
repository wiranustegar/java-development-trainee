public class LambaThread extends Thread{
    public void run(){
        while (true){
            System.out.println("===LAMBDA THREAD");
            try {
                Thread.sleep(1000);
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}

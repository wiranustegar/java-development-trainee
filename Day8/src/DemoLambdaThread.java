public class DemoLambdaThread {

    public static void main(String[] args) {
        LambaThread t1 = new LambaThread();
        t1.start();

        Runnable tn = () -> {
            while (true){
                System.out.println("===LAMBDA THREAD 2");
                try {
                    Thread.sleep(1000);
                } catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(tn);
        t2.start();

        Thread t3 = new Thread(() -> {
            while (true){
                System.out.println("===LAMBDA THREAD 3");
                try {
                    Thread.sleep(1000);
                } catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        t3.start();

    }
}

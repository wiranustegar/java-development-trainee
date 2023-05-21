package id.co.indivara.jdt12.day8;

public class GakJelas {
    public void muter(){
        while (true){
            try {
                System.out.println("...gak...jelas...");
                Thread.sleep(1000);
            } catch (Exception e){
                System.out.println(e);
            }
        }

    }
}

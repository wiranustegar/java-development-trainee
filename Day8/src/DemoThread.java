import id.co.indivara.jdt12.day8.*;

public class DemoThread {
    public static void main(String[] args) {

        Thread one = new InfinityLoopOne();
        Thread two = new InfinityLoopTwo();
        Thread three = new InfinityLoopThree();
        InfinityLoopFour newFour = new InfinityLoopFour();
        Thread four = new Thread(newFour);

        one.start();
        two.start();
        three.start();
        four.start();

    }
}

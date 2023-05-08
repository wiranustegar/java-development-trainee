public class LogicOperator {
    public static void main(String[] args) {

        boolean benar = true;
        boolean salah = false;
        boolean betul = 10>6;
        boolean tdkBetul = 12<3;

        System.out.println("Benar && Salah: " + (benar && salah));
        System.out.println("Benar && Betul: " + (benar && betul));
        System.out.println("Salah && tdkbetul: " + (salah && tdkBetul));

        System.out.println("Benar || Salah: " + (benar || salah));
        System.out.println("Benar || Betul: " + (benar || betul));
        System.out.println("Salah || tdkbetul: " + (salah || tdkBetul));

        System.out.println("!benar: " + !benar);
        System.out.println("!tdkBetul: " + !tdkBetul);

        System.out.println(!(benar&&(salah || tdkBetul)&&betul));
        System.out.println(!((5<4)||(10==(20/2))||false&&"jakarta".equals("bandung")));


    }
}

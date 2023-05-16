public class DemoPolymorph {

    public static void test(AlatMusik x){
        x.play();
        x.stop();
        if (x instanceof Gitar){
            ((Gitar) x).dipetik();
        } else if (x instanceof Piano) {
            ((Piano) x).ditekan();
        }

        x.dijual();

    }

    public static void main (String [] args){
        Gitar akustik = new Gitar();
        test(akustik);

        Piano korg = new Piano();
        test(korg);

        //AlatMusik x = new AlatMusik();

    }
}

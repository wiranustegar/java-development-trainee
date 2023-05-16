public class DemoTurunan {
    public static void main(String[] args) {

        Motor mio = new Motor();
        mio.jalan();
        mio.berhenti();
        mio.jumping();

        Mobil alay = new Mobil();
        alay.jalan();
        alay.berhenti();
        alay.mundur();
        alay.mengenangParent();

        Kendaraan sepeda = new Kendaraan();
        sepeda.jalan();
        sepeda.berhenti();

        MobilSport lambo = new MobilSport();
        lambo.jalan();
        lambo.ngebut();
        lambo.berhenti();
    }
}

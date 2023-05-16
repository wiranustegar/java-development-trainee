public class PostgreDriver implements Database {
    @Override
    public void konek() {
        System.out.println("PGSQL KONEK..");
    }

    @Override
    public void diskonek() {
        System.out.println("PGSQL DISKONEK..");
    }
}

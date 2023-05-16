public class MySqlDriver implements Database {
    @Override
    public void konek() {
        System.out.println("MYSQL KONEK...");
    }

    @Override
    public void diskonek() {
        System.out.println("MYSQL DISKONEK...");
    }
}

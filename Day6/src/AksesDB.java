public class AksesDB {

    static void aksesDatabase(Database d){
        d.konek();
        d.diskonek();
    }

    public static void main(String[] args) {
        Database driverMysql = new MySqlDriver();
        aksesDatabase(driverMysql);

        Database driverPostgre = new PostgreDriver();
        aksesDatabase(driverPostgre);
    }
}

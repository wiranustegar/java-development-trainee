import id.co.indivara.jdt12app.db.LibraryDB;
import id.co.indivara.jdt12app.files.LibraryFiles;
import id.co.indivara.jdt12app.io.LibraryIO;
import id.co.indivara.mylib.Coba;

public class DemoPackage {
    public static void main(String[] args) {
        LibraryIO io = new LibraryIO();
        io.demoIO();
        LibraryDB db = new LibraryDB();
        db.demoDB();
        LibraryFiles files = new LibraryFiles();
        files.demoFiles();
        Coba c = new Coba();
        c.test();
    }
}

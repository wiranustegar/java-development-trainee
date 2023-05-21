import id.co.indivara.jdt12.LibrarySatu;

public class DemoAksesControl extends LibrarySatu{
    public static void main(String[] args) {
        LibrarySatu l = new LibrarySatu();

        //HANYA METHOD YANG PUBLIC YANG BISA DPANGGIL DARI OBJECT, BEDA PACKAGE
        l.methodSatu();
        DemoAksesControl d = new DemoAksesControl();
        d.methodEmpat();
    }
}

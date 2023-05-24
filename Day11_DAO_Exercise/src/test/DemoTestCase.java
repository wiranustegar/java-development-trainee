import org.junit.*;

public class DemoTestCase {

    @BeforeClass
    public static void pertama(){
        System.out.println("Pertama");
    }

    @AfterClass
    public static void terakhir(){
        System.out.println("Terakhir");
    }

    @Before
    public void sebelum(){
        System.out.println("Sebelum");
    }

    @After
    public void sesuda(){
        System.out.println("Sesudah");
    }

    @Test
    public void satu(){
        System.out.println("Satu");
    }

    @Test
    public void dua(){
        System.out.println("Dua");
    }

    @Test
    public void tiga(){
        System.out.println("Tiga");
    }

    @Test(timeout = 1000)
    public void jalan(){
        while (true){

        }
    }
}

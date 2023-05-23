package id.co.indivara.hello;
import org.joda.time.LocalTime;
import com.mysql.jdbc.Driver;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        System.out.println(g.sayHello());

        LocalTime t = new LocalTime();
        System.out.println("Waktu saat ini "+ t);


    }
}

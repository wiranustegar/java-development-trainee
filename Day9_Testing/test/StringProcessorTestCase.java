import id.co.indivara.jdt12app.StringProcessor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringProcessorTestCase {

    StringProcessor sp = new StringProcessor();

    @Test
    public void sambungKataTest(){
        assertEquals("Halo Dunia", sp.sambungKata("Halo", "Dunia"));
    }

    @Test
    public void gedeinKataTest(){
        assertEquals("HALO", sp.gedeinKata("Halo"));
    }

    @Test
    public void kecilinKataTest(){
        assertEquals("dunia", sp.kecilinKata("DUNIA"));
    }

    @Test(expected = NumberFormatException.class)
    public void hurufKeAngkaTest(){
        assertEquals(12, sp.hurufKeAngka("kjkj"));
    }


}

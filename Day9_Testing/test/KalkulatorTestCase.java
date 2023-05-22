import id.co.indivara.jdt12app.Kalkulator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KalkulatorTestCase {
    Kalkulator pengali = new Kalkulator(10,2);
    Kalkulator pembagi = new Kalkulator(10,5);
    Kalkulator penjumlah = new Kalkulator(5, 5);
    Kalkulator pengurang = new Kalkulator(5, 3);
    Kalkulator bagiNol = new Kalkulator(3,0);

    @Test
    public void kaliTest(){
        assertEquals(20, pengali.kali());
    }

    @Test
    public void bagiTest(){
        assertEquals(2,pembagi.bagi());
    }

    @Test
    public void jumlahTest(){
        assertEquals(10,penjumlah.jumlah());
    }

    @Test
    public void kurangTest(){
        assertEquals(2,pengurang.kurang());
    }

    @Test(expected = ArithmeticException.class)
    public void bagiNolTest(){
        assertEquals(2,bagiNol.bagi());
    }
}

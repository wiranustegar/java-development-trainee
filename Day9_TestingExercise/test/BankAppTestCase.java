import id.co.indivara.jdt12.bank.BankApp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAppTestCase {
    BankApp ba = new BankApp();


    @Test
    public void bukaRekeningTest(){
        assertEquals("rekening",ba.bukaRekening("rekening",1000));
    }

    @Test
    public void cekSaldoTest(){
        assertEquals(0,ba.cekSaldo("rekening"));
    }

    @Test
    public void tarikTest(){
        assertEquals(-200,ba.tarik(200));
    }

    @Test
    public void setorTest(){
        assertEquals(100,ba.setor(100));
    }
}

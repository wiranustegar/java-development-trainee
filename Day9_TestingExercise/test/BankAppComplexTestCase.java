import id.co.indivara.jdt12.bank.BankApp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAppComplexTestCase {

    BankApp ba = new BankApp();

    @Test
    public void bukaRekeningCekSaldoTarikDanSetor(){
        assertEquals("norek", ba.bukaRekening("norek", 1000));
        assertEquals(800,ba.tarik(200));
        assertEquals(900, ba.setor(100));
        assertEquals(900,ba.cekSaldo("norek"));
    }
}

import id.co.indivara.db.dao.RegionDAO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegionTestCase {
    RegionDAO reg =new RegionDAO();

    @Test
    public void cariDataTest(){
        assertEquals("Africa", reg.findRegion(3).getRegionName());
    }

    @Test
    public void deleteDataTest(){
        assertEquals(0, reg.removeRegion(2));
    }

}

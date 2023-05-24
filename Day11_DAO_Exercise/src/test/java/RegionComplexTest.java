import id.co.indivara.db.dao.RegionDAO;
import id.co.indivara.db.entity.Region;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegionComplexTest {
    RegionDAO reg = new RegionDAO();

    @Test
    public void insertDanCariDataTest(){
        assertEquals(1, reg.createRegion(new Region(9,"Uganda")));
        assertEquals("Uganda", reg.findRegion(9).getRegionName());
    }

}

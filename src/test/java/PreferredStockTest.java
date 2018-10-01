import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PreferredStockTest {

    PreferredStock preferredStock;

    @Before
    public void setUp() throws Exception {
        preferredStock = new PreferredStock("GIN", 8, 100, 0.02);
    }

    @Test
    public void getFixedDividend() {
        assertEquals(0.02, preferredStock.getFixedDividend(), 0);
    }
}
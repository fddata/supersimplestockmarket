import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommonStockTest {

    CommonStock commonStock;

    @Before
    public void setUp() throws Exception {
        commonStock = new CommonStock("TEA", 0, 100);
    }

    @Test
    public void canGetSymbol() {
        assertEquals("TEA", commonStock.getSymbol());
    }

    @Test
    public void canGetLastDividend() {
        assertEquals(0, commonStock.getLastDividend(), 0);
    }

    @Test
    public void canGetParValue() {
        assertEquals(100, commonStock.getParValue(), 0);
    }
}
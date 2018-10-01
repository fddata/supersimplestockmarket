import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class CommonStockTest {

    CommonStock commonStock;



    @Before
    public void setUp() throws Exception {
        commonStock = new CommonStock("TEA", 1, 100);

    }

    @Test
    public void canGetSymbol() {
        assertEquals("TEA", commonStock.getSymbol());
    }

    @Test
    public void canGetLastDividend() {
        assertEquals(1, commonStock.getLastDividend(), 0);
    }

    @Test
    public void canGetParValue() {
        assertEquals(100, commonStock.getParValue(), 0);
    }


    @Test
    public void calculateDividendYield() {
        assertEquals(0.095, commonStock.calculateDividendYield(10.5), 0.01);
    }

    @Test
    public void calculatePERatio() {
        assertEquals(40, commonStock.calculatePERatio(40.00),0);
    }
}
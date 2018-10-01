import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class TradeTest {

    Trade commonTrade;
    Trade preferredTrade;
    CommonStock commonStock;
    PreferredStock preferredStock;

    @Before
    public void setUp() throws Exception {
        commonStock = new CommonStock("TEA", 1, 100);
        preferredStock = new PreferredStock("GIN", 8, 100,  0.02);
        commonTrade = new Trade(commonStock, 100, true, 15.55);
        preferredTrade = new Trade(preferredStock, 200, false, 10.99);
//        now = new Timestamp(new java.util.Date().getTime());
    }

    @Test
    public void getQuantity() {
        assertEquals(100, commonTrade.getQuantity(), 0);
    }

    @Test
    public void getStock() {
        assertEquals(commonStock, commonTrade.getStock());
    }

    @Test
    public void getTimestamp() {
        assertNotNull(commonTrade.getTimestamp());
        System.out.println("Timestamp is: " + commonTrade.getTimestamp());
    }

    @Test
    public void isBuy() {
        assertEquals(false, preferredTrade.isBuy());
    }

    @Test
    public void getTradedPrice() {
        assertEquals(15.55, commonTrade.getTradedPrice(), 0);
    }
}
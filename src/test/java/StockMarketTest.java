import org.junit.Before;

import static org.junit.Assert.*;

public class StockMarketTest {

    CommonStock stockTEA;
    CommonStock stockPOP;
    CommonStock stockALE;
    PreferredStock stockGIN;
    CommonStock stockJOE;

    Trade tradeTEA;
    Trade tradePOP;
    Trade tradeALE;
    Trade tradeGIN;
    Trade tradeJOE;

    StockMarket stockMarket;

    @Before
    public void setUp() {
        stockTEA = new CommonStock("TEA", 0,100);
        stockPOP = new CommonStock("POP", 8,100);
        stockALE = new CommonStock("ALE", 23,60);
        stockGIN = new PreferredStock("GIN", 23,60, 0.02);
        stockJOE = new CommonStock("JOE", 13,250);
    }
}
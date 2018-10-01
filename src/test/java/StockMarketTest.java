import org.junit.Before;
import org.junit.Test;

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
//        Setting up stocks as per the brief
        stockTEA = new CommonStock("TEA", 0,100);
        stockPOP = new CommonStock("POP", 8,100);
        stockALE = new CommonStock("ALE", 23,60);
        stockGIN = new PreferredStock("GIN", 23,60, 0.02);
        stockJOE = new CommonStock("JOE", 13,250);

//        setting up some trades - note timestamps will be set when a test is run
        tradeTEA = new Trade(stockTEA, 10, true, 1.00);
        tradePOP = new Trade(stockPOP, 100, false, 3.00);
        tradeALE = new Trade(stockALE, 1,false,20.00);
        tradeGIN = new Trade(stockGIN, 50,true, 10.00);
        tradeJOE = new Trade(stockJOE,200,true,5.00);

//        adding trades to the stock market
        stockMarket = new StockMarket();
        stockMarket.addTrade(tradeTEA);
        stockMarket.addTrade(tradePOP);
        stockMarket.addTrade(tradeALE);
        stockMarket.addTrade(tradeGIN);
        stockMarket.addTrade(tradeJOE);
    }

    @Test
    public void stockMarketHasTrades() {
        assertEquals(5, stockMarket.getNumberOfTrades(), 0);
    }


    @Test
    public void canCalculateGeometricMean() {
        assertEquals(4.96, stockMarket.calculateGeometricMean(),0.01);
    }
}
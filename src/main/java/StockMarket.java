import java.util.ArrayList;

public class StockMarket {

    private ArrayList<Trade> trades;

    public StockMarket() {
        this.trades = new ArrayList<>();
    }

    public ArrayList<Trade> getTrades() {
        return trades;
    }

    public void addTrade(Trade trade){
        this.trades.add(trade);
    }

    public int getNumberOfTrades(){
        return this.trades.size();
    }


    public  double calculateGeometricMean(){

//        TODO Refactor this into separate methods?

//        first get an array of prices for each trade:

        double[] priceArray = new double[this.getNumberOfTrades()];
        for (int i = 0; i < this.getNumberOfTrades(); i++ ){
             priceArray[i] = this.trades.get(i).getTradedPrice();
        }
//        then multiply these prices together:

        double reducerSum = priceArray[0];
        for(int i = 1; i < priceArray.length; i++){
            reducerSum *= priceArray[i];
        }

//        then take the 1/n power of this sum:
        return Math.pow(reducerSum, (1.0 / priceArray.length));

    }

    public double calculateVolumeWeightedStockPrice(){
//        TODO write this method!
        return 1.0;
    }
}

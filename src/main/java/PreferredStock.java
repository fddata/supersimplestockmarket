public class PreferredStock extends CommonStock {

    private double fixedDividend;

    public PreferredStock(String symbol, double lastDividend, double parValue, double fixedDividend) {
        super(symbol, lastDividend, parValue);
        this.fixedDividend = fixedDividend;
    }

    public double getFixedDividend() {
        return fixedDividend;
    }

    public double calculateDividendYield(double price){
        return ((this.getFixedDividend() * this.getParValue()) / price);
    }
}

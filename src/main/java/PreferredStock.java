public class PreferredStock extends CommonStock {

    private double fixedDividend;

    public PreferredStock(String symbol, double lastDividend, double parValue, double fixedDividend) {
        super(symbol, lastDividend, parValue);
        this.fixedDividend = fixedDividend;
    }

    public double getFixedDividend() {
        return fixedDividend;
    }
}

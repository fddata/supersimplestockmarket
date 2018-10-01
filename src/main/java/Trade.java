import java.sql.Timestamp;

public class Trade {


    private int quantity;
    private CommonStock stock;
    private Timestamp timestamp;
    private boolean isBuy;
    private double tradedPrice;

    public Trade(CommonStock stock, int quantity,  boolean isBuy, double tradedPrice) {
        this.quantity = quantity;
        this.stock = stock;
        this.timestamp = new Timestamp(new java.util.Date().getTime());
        this.tradedPrice = tradedPrice;
        this.isBuy = isBuy;
    }


    public int getQuantity() {
        return quantity;
    }

    public CommonStock getStock() {
        return stock;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public boolean isBuy() {
        return isBuy;
    }

    public double getTradedPrice() {
        return tradedPrice;
    }
}

public class CommonStock {

        private String symbol;
        private double lastDividend;
        private double parValue;



        public CommonStock(String symbol, double lastDividend, double parValue) {
                this.symbol = symbol;
                this.lastDividend = lastDividend;
                this.parValue = parValue;


        }


        public String getSymbol() {
                return symbol;
        }

        public double getLastDividend() {
                return lastDividend;
        }

        public double getParValue() {
                return parValue;
        }

        public double calculateDividendYield(double price){
                return (this.lastDividend / price);
        }
}

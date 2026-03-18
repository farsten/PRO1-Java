package OpgaverL09.ex4;

public class StockApp {
    void main() {
        Stock s1 = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        IO.println("Stock: ");
        IO.println("Symbol: " + s1.getSymbol());
        IO.println("Name: " + s1.getName());
        IO.println("Yesterdays stock price: " + s1.getPreviousClosingPrice());
        IO.println("Todays stock price: " + s1.getCurrentPrice());
        IO.println("Percentage price change: " + s1.getChangePercent());
    }
}

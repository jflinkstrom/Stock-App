package edu.JasonFlinkstrom.advancedjava.stock;

/**
* This class contains information about a stock symbol
 **/
public class StockQuote {

    private String symbol;

    /**
     * ctor
     * @param symbol - the stock's symbol
     **/
    public StockQuote(String symbol) {
        this.symbol = symbol;
    }

    /**
     * @return symbol that represents a company's stock
     */
    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Symbol: " + symbol;
    }
}
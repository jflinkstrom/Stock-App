package edu.JasonFlinkstrom.advancedjava.stock;

/**
 * A class that implements StockService and returns an instance of StockQuote
 */
public class BasicStockService implements StockService {

    /**
     *
     * @param symbol the stock symbol of the company you want a quote for.
     * e.g. APPL for APPLE
     * @return instance of StockQuote
     */
    @Override
    public StockQuote getQuote(String symbol) {

        return new StockQuote(symbol);
    }
}

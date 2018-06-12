package edu.JasonFlinkstrom.advancedjava.stock;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
    public StockQuote getQuote(String symbol) {

        return new StockQuote(symbol);
    }

    /**
     * Get a historical list of stock quotes for the provided
     * symbol
     * @param symbol the stock symbol to search for
     * @param from the date of the first stock quote
     * @param until the date of the last stock quote
     * @return a list of StockQuote instances.
     * One for each day in the range specified.
     */
    public List<StockQuote> getQuote(String symbol, Calendar from,
                                     Calendar until){
        Date start = from.getTime();
        Date end = until.getTime();

        Calendar calFrom = Calendar.getInstance();
        calFrom.setTime(start);

        List<StockQuote> stockQuote = new ArrayList<>();

        while(start.before(end)) {
            stockQuote.add(new StockQuote(symbol, start, end));
            calFrom.setTime(start);
            calFrom.add(Calendar.DAY_OF_YEAR, 1);
            start = calFrom.getTime();
        }

        return stockQuote;
    }
}

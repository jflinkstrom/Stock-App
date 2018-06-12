package edu.JasonFlinkstrom.advancedjava.stock;

import java.util.Date;

/**
* This class contains information about a stock symbol
 **/
public class StockQuote {

    private String symbol;
    private Date from;
    private Date until;

    /**
     * ctor
     * @param symbol - the stock's symbol
     **/
    public StockQuote(String symbol){
        this.symbol = symbol;
    }

    public StockQuote(String symbol, Date from, Date until) {
        this.symbol = symbol;
        this.from = from;
        this.until = until;
    }

    /**
     * @return symbol that represents a company's stock
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @return from that represents a date
     */
    public Date getFrom() {
        return from;
    }

    /**
     * @return until that represents a date
     */
    public Date getUntil() {
        return until;
    }

    @Override
    public String toString() {

       return "Symbol: " + symbol +
               "Date: " + from;
    }

}
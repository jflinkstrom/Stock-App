package edu.JasonFlinkstrom.advancedjava.stock;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
* Unit test for StockQuote class
 */
public class StockQuoteTest {

    /**
    * Positive test verifies given string is returned from getSymbol method
     */
    @Test
    public void getSymbolpPosTest() {
        String symbol = "APPL";
        StockQuote stockQuote = new StockQuote(symbol);
        assertTrue(stockQuote.getSymbol().equals(symbol));
    }

    /**
    * Negative test verifies symbol is null
     */
    @Test
    public void getSymbolNegTest(){
        String symbol = "APPL";
        StockQuote stockQuote = new StockQuote(null);
        assertNull(stockQuote.getSymbol());
    }

    /**
     * Positive test to check getFrom and getUntil
     */
    @Test
    public void getFromAndUntilPosTest() {
        Date date = new Date();
        StockQuote stockQuote = new StockQuote("APPL", date, date);
        assertEquals(date, stockQuote.getFrom());
        assertEquals(date, stockQuote.getUntil());
    }
}
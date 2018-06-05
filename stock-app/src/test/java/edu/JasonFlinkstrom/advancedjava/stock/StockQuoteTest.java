package edu.JasonFlinkstrom.advancedjava.stock;

import org.junit.Test;

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
        String s = "APPL";
        StockQuote stockQuote = new StockQuote(s);
        assertTrue(stockQuote.getSymbol().equals(s));
    }

    /**
    * Negative test verifies symbol is not returned correctly
     */
    @Test
    public void getSymbolNegTest(){
        String s = "APPL";
        StockQuote stockQuote = new StockQuote(s);
        assertFalse(stockQuote.getSymbol().equals(s.length()));
    }
}
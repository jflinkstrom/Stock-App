package edu.JasonFlinkstrom.advancedjava.stock;

import org.junit.Test;

import static org.junit.Assert.*;
/**
* Unit Test for BasicStockService class
 */
public class BasicStockServiceTest {

    /**
    * Positive test verifies getQuote returns correct symbol
     */
    @Test
    public void getQuotePosTest() {
       BasicStockService bSS = new BasicStockService();
        String symbol = "APPL";
        assertTrue(bSS.getQuote(symbol).getSymbol().equals("APPL"));
    }

    /**
    * Negative test verifies getQuote returns incorrect symbol
     */
    @Test
    public void getQuoteNegTest(){
        BasicStockService bSS = new BasicStockService();
        String symbol = "APPL";
        assertFalse(bSS.getQuote(symbol).getSymbol().equals("APPL".length()));
    }
}
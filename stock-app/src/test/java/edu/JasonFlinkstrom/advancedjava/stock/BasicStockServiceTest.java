package edu.JasonFlinkstrom.advancedjava.stock;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
        StockQuote result = bSS.getQuote(symbol);
        assertEquals(result.getSymbol(), "APPL");
    }

    /**
    * Negative test verifies getQuote returns null
     */
    @Test
    public void getQuoteNegTest(){
        BasicStockService bSS = new BasicStockService();
        String symbol = "APPL";
        StockQuote result = bSS.getQuote(null);
        assertNull(result.getSymbol());
    }

    /**
     * Positive test verifies getListQuote holds correct number of elements
     */
    @Test
    public void getListQuotePosTest(){
        String symbol = "APPL";
        Date date = new Date();

        Calendar from = Calendar.getInstance();
        from.setTime(date);

        Calendar until = Calendar.getInstance();
        until.setTime(date);
        until.add(Calendar.DAY_OF_YEAR, 5);

        BasicStockService bSS = new BasicStockService();
        List<StockQuote> stockQuote = bSS.getQuote(symbol, from, until);
        assertEquals(stockQuote.size(), 5);
    }
}
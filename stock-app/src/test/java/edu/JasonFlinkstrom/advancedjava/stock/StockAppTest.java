package edu.JasonFlinkstrom.advancedjava.stock;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
* Test StockApp class using mockito
* NOTE: does not work yet
 */
public class StockAppTest {

    /**
    * Test if getStockSymbol method returns symbol is equal to given string
    * NOTE: does not work yet
     */
    @Test
    public void getStockSymbol() {
        StockService stockServiceMock = Mockito.mock(StockService.class);

        String symbol = "APPL";

        when(stockServiceMock.getQuote(any(String.class))).thenReturn(new StockQuote(symbol));

        StockApp stockApp = new StockApp(stockServiceMock);

        List<StockQuote> stockSymbol = stockApp.getStockSymbol(symbol);

        assertTrue("symbol should read APPL", stockSymbol.equals(symbol));
    }
}
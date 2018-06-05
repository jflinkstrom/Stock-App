package edu.JasonFlinkstrom.advancedjava.stock;

import java.util.ArrayList;
import java.util.List;

/**
* StockApp class implements StockService interface
* NOTE: does not work yet
 */
public class StockApp {

    private StockService stockService;

    public StockApp(StockService stockService){
        this.stockService = stockService;
    }

    public List<StockQuote> getStockSymbol(String symbol){
        List<StockQuote> returnValue = new ArrayList<>();
        returnValue.add(stockService.getQuote(symbol));
        return returnValue;
    }
}


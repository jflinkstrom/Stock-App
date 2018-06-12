package edu.JasonFlinkstrom.advancedjava.stock;

/**
 *  a basic factory class that returns a basic stock service
 */
public class StockServiceFactory{

    /**
     *
     * @return BasicStockService - an implementation of the StockService Interface
     */
    public static StockService createStockService(){
         return new BasicStockService();
    }
}
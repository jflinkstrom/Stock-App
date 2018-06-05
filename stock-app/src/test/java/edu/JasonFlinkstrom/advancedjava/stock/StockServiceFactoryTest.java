package edu.JasonFlinkstrom.advancedjava.stock;

import org.junit.Test;

import static org.junit.Assert.*;

/**
* Unit Test for StockServiceFactory class
 */
public class StockServiceFactoryTest {

    /**
    * Positive test verifies StockService is an instance of StockServiceFactory
     */
    @Test
    public void createStockServicePosTest() {
        StockServiceFactory sSF = new StockServiceFactory();
        assertTrue(sSF.createStockService() instanceof StockService);
    }

    /**
    * Negative test verifies StockQuote is not an instance of StockServiceFactory
     */
    @Test
    public void createStockServiceNegTest(){
        StockServiceFactory sSF = new StockServiceFactory();
        assertFalse(sSF.createStockService() instanceof StockQuote);
    }
}
package edu.JasonFlinkstrom.advancedjava.stock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
* StockApp class implements StockService interface
 */
public class StockApp {

    public static void main(String[] args) {
        String sym = "APPL";
        String from = "01-01-2018";
        String until = "01-05-2018";

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

        /**
        *first getQuote method
         */
        StockService stockService = StockServiceFactory.createStockService();
        System.out.println(stockService.getQuote(sym));


        /**
        *second getQuote method
         */
        try {
            Date date = sdf.parse(from);

            Calendar cal = Calendar.getInstance();
            cal.setTime(date);

            Date date2 = sdf.parse(until);

            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(date2);

            StockService bSS = StockServiceFactory.createStockService();
            List<StockQuote> stockQuote;
            stockQuote = bSS.getQuote(sym, cal, cal2);

            System.out.println(stockQuote);


        } catch (ParseException e){
            System.out.println("Wrong Date Format");
        }
        }
}

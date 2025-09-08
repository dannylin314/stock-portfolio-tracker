package com.danny.stocktracker.service;

import com.danny.stocktracker.client.StockClient;
import com.danny.stocktracker.domain.dto.StockResponse;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    private StockClient stockClient;

    public StockService(StockClient stockClient) {
        this.stockClient = stockClient;
    }

    public StockResponse getStockForSymbol(final String stockSymbol) {
        stockClient.getStockQuote(stockSymbol);

        return new StockResponse();
    }
}

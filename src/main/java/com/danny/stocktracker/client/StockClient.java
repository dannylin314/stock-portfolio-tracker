package com.danny.stocktracker.client;

import com.danny.stocktracker.domain.dto.StockResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class StockClient {
    private final WebClient webClient;

    @Value("${alpha.vantage.api.key}")
    private String apiKey;
}

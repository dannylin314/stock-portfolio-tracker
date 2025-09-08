package com.danny.stocktracker.domain.dto;

import lombok.Builder;

@Builder
public record StockResponse(
        String symbol,
        double price,
        String lastUpdated
) {
}

package com.danny.stocktracker.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record StockOverviewResponse(
        @JsonProperty("Symbol") String symbol,
        @JsonProperty("Name") String name,
        @JsonProperty("Description") String description,
        @JsonProperty("Sector") String sector,
        @JsonProperty("Industry") String indsutry,
        @JsonProperty("MarketCapitalization") String marketCap,
        @JsonProperty("PERatio") String peRation,
        @JsonProperty("DividendYield") String dividendYield
) {
}

package com.danny.stocktracker.domain.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "stocks")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "symbol", nullable = false, unique = true)
    private String symbol;
}

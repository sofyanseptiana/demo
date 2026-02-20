package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerCurrencyRepository 
        extends JpaRepository<PlayerCurrency, Long> {
}

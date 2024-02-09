package com.example.CurrencyConvertorQA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    Currency findByFromCurrency(String FromCurrency);
}

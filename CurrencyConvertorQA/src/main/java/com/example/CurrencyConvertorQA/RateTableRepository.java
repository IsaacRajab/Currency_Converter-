package com.example.CurrencyConvertorQA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateTableRepository extends JpaRepository<RateTable, Long> {
    RateTable findByFromStringAndToString(String from,String TO);
}

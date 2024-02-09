package com.example.CurrencyConvertorQA;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class RateTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fromString;
    private String toString;
    private double rate;

}

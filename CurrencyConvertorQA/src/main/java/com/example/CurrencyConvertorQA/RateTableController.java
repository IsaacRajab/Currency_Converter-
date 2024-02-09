package com.example.CurrencyConvertorQA;

import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/Rate")
public class RateTableController {
    final RateTableService service;

    public RateTableController(RateTableService service) {
        this.service = service;
    }

    @GetMapping
    public CurrencyConversionResult CurrentConvert(@RequestParam("amount") int amount,
                                                   @RequestParam("fromCurrency") String fromCurrency,
                                                   @RequestParam("toCurrency") String toCurrency){



 RateTable Rate =service.FindByRateTable(fromCurrency,toCurrency);
        CurrencyConversionResult currencyConversionResult = new CurrencyConversionResult();
        currencyConversionResult.setExchangeRate(Rate.getRate());
        currencyConversionResult.setConvertedAmount(amount*(Rate.getRate()));
        System.out.println(currencyConversionResult);
        return currencyConversionResult;
    }

}

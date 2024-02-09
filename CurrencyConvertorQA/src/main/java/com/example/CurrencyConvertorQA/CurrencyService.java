package com.example.CurrencyConvertorQA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CurrencyService {



    private final CurrencyRepository currencyRepository;

    @Autowired
    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }



    public void addCurrency(Currency currency) {
        currencyRepository.save(currency);
    }

    public List<Currency> getCurrencies() {
        return currencyRepository.findAll();
    }
}

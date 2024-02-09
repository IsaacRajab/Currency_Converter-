package com.example.CurrencyConvertorQA;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@RestController
public class CurrencyConversionController {

    private final CurrencyService currencyService;

    @Autowired
    public CurrencyConversionController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/convert")
    public CurrencyConversionResult convertCurrency(@RequestParam("amount") int amount,
                                                    @RequestParam("fromCurrency") String fromCurrency,
                                                    @RequestParam("toCurrency") String toCurrency) throws MalformedURLException {
        double convertedAmount ;
        double exchangeRate ;
        try {
            String apiUrl = " https://v6.exchangerate-api.com/v6/6ca0526620dd66f16a005998/pair/" + fromCurrency + "/" + toCurrency + "/" + amount + "";
            URL url;
            url = new URL(apiUrl);
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();

            JsonParser jsonParser = new JsonParser();
            JsonElement jsonRoot = jsonParser.parse(new InputStreamReader((InputStream) httpConnection.getContent()));
            JsonObject jsonObject = jsonRoot.getAsJsonObject();
            System.out.println(jsonObject);
            String conversion_result = jsonObject.get("conversion_result").toString();
            String conversion_rate = jsonObject.get("conversion_rate").toString();
            exchangeRate=Double.parseDouble(conversion_rate);
            convertedAmount=Double.parseDouble(conversion_result);
            System.out.println("conversion result: "+conversion_result+"\nconversion rate: "+conversion_rate);
        }


         catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new CurrencyConversionResult(convertedAmount, exchangeRate);

    }

    @PostMapping("/currencies")
    public void addCurrency(@RequestBody Currency currency) {
        currencyService.addCurrency(currency);
    }

    @GetMapping("/currencies")
    public List<Currency> getCurrencies() {
        return currencyService.getCurrencies();
    }
}

package com.example.CurrencyConvertorQA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RateTableControllerTest {
    @Autowired
    private RateTableController controller;
    @Mock
    private RateTableRepository rateTableRepository;



    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @ParameterizedTest
    @CsvSource({
            "USD, ILS, 3.6164",
            "GBP, CAD, 1.69",
    })
    @DisplayName("Test currency conversion rates")
    public void testFindRateByFromAndToCurrency(String fromCurrency, String toCurrency, double expectedRate) {
        Mockito.when(rateTableRepository.findByFromStringAndToString(fromCurrency, toCurrency))
                .thenReturn(new RateTable(0L, fromCurrency, toCurrency, expectedRate));

        RateTable actualRate = rateTableRepository.findByFromStringAndToString(fromCurrency, toCurrency);
        assertEquals(expectedRate, actualRate.getRate());

    }

    @Test
    @DisplayName("Test WITH Mockito")
    public void testFindRateByFromAndToCurrency(){
        //Test 1
        RateTableService rateTableService = new RateTableService(rateTableRepository);
        String fromCurrency1 = "USD";
        String toCurrency1 = "ILS";
        double expectedRate1 = 3.6164;

        Mockito.when(rateTableRepository.findByFromStringAndToString(fromCurrency1, toCurrency1)).thenReturn( new RateTable(0l,"","",3.6164) );
        RateTable actualRate1 = rateTableRepository.findByFromStringAndToString(fromCurrency1, toCurrency1);
        Assertions.assertEquals(expectedRate1, actualRate1.getRate());
        //Test 2
        String fromCurrency2 = "GBP";
        String toCurrency2 = "CAD";
        double expectedRate2 = 1.69;
        Mockito.when(rateTableRepository.findByFromStringAndToString(fromCurrency2, toCurrency2)).thenReturn( new RateTable(0l,"","",1.69) );

        RateTable actualRate2 = rateTableRepository.findByFromStringAndToString(fromCurrency2, toCurrency2);
        Assertions.assertEquals(expectedRate2, actualRate2.getRate());
    }
    @Test
    @DisplayName("Test conversion with unsupported currency")
    public void testConversionWithUnsupportedCurrency() {
        String unsupportedCurrency = "XYS";
        Mockito.when(rateTableRepository.findByFromStringAndToString(unsupportedCurrency, unsupportedCurrency))
                .thenThrow(UnsupportedCurrencyException.class);

        assertThrows(UnsupportedCurrencyException.class, () -> {
            rateTableRepository.findByFromStringAndToString(unsupportedCurrency, unsupportedCurrency);
        });
    }


    @Test
    @DisplayName("Test conversion with unsupported currency")
    public void testConversionWithUnsupportedCurrency2() {
        // Arrange
        String unsupportedCurrency = "XYS";
        RateTableRepository rateTableRepository = Mockito.mock(RateTableRepository.class);

        Mockito.when(rateTableRepository.findByFromStringAndToString(unsupportedCurrency, unsupportedCurrency))
                .thenThrow(new UnsupportedCurrencyException("Unsupported currency"));

        // Act and Assert
        assertThrows(UnsupportedCurrencyException.class, () ->
                rateTableRepository.findByFromStringAndToString(unsupportedCurrency, unsupportedCurrency)
        );
    }

    @Test
    @DisplayName( "ConvertCurrency From Database ")
    public void ConvertCurrency_FromDatabase(){
        controller.CurrentConvert(100,"USD","ILS");
    }


}

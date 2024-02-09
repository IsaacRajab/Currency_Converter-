package com.example.CurrencyConvertorQA;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String NameFrom;
    private String fromCurrency;
    private  String Nameto;

    private String toCurrency;

    public static List<Currency> createCurrencyBeans() {
        List<Currency> currencies = new ArrayList<>();

        currencies.add(new Currency(null, "United Arab Emirates Dirham", "AED", "United Arab Emirates Dirham", "AED"));
        currencies.add(new Currency(null, "Afghan Afghani", "AFN", "Afghan Afghani", "AFN"));
        currencies.add(new Currency(null, "Albanian Lek", "ALL", "Albanian Lek", "ALL"));
        currencies.add(new Currency(null, "Armenian Dram", "AMD", "Armenian Dram", "AMD"));
        currencies.add(new Currency(null, "Netherlands Antillian Guilder", "ANG", "Netherlands Antillian Guilder", "ANG"));
        currencies.add(new Currency(null, "Angolan Kwanza", "AOA", "Angolan Kwanza", "AOA"));
        currencies.add(new Currency(null, "Argentine Peso", "ARS", "Argentine Peso", "ARS"));
        currencies.add(new Currency(null, "Aruban Florin", "AWG", "Aruban Florin", "AWG"));
        currencies.add(new Currency(null, "Azerbaijani Manat", "AZN", "Azerbaijani Manat", "AZN"));
        currencies.add(new Currency(null, "Bosnia and Herzegovina Mark", "BAM", "Bosnia and Herzegovina Mark", "BAM"));
        currencies.add(new Currency(null, "Barbados Dollar", "BBD", "Barbados Dollar", "BBD"));
        currencies.add(new Currency(null, "Bangladeshi Taka", "BDT", "Bangladeshi Taka", "BDT"));
        currencies.add(new Currency(null, "Bulgarian Lev", "BGN", "Bulgarian Lev", "BGN"));
        currencies.add(new Currency(null, "Bahraini Dinar", "BHD", "Bahraini Dinar", "BHD"));
        currencies.add(new Currency(null, "Burundian Franc", "BIF", "Burundian Franc", "BIF"));
        currencies.add(new Currency(null, "Bermudian Dollar", "BMD", "Bermudian Dollar", "BMD"));
        currencies.add(new Currency(null, "Brunei Dollar", "BND", "Brunei Dollar", "BND"));
        currencies.add(new Currency(null, "Bolivian Boliviano", "BOB", "Bolivian Boliviano", "BOB"));
        currencies.add(new Currency(null, "Brazilian Real", "BRL", "Brazilian Real", "BRL"));
        currencies.add(new Currency(null, "Bahamian Dollar", "BSD", "Bahamian Dollar", "BSD"));
        currencies.add(new Currency(null, "Bhutanese Ngultrum", "BTN", "Bhutanese Ngultrum", "BTN"));
        currencies.add(new Currency(null, "Belarusian Ruble", "BYN", "Belarusian Ruble", "BYN"));
        currencies.add(new Currency(null, "Belize Dollar", "BZD", "Belize Dollar", "BZD"));
        currencies.add(new Currency(null, "Canadian Dollar", "CAD", "Canadian Dollar", "CAD"));
        currencies.add(new Currency(null, "Congolese Franc", "CDF", "Congolese Franc", "CDF"));
        currencies.add(new Currency(null, "Swiss Franc", "CHF", "Swiss Franc", "CHF"));
        currencies.add(new Currency(null, "Chilean Peso", "CLP", "Chilean Peso", "CLP"));
        currencies.add(new Currency(null, "Chinese Renminbi", "CNY", "Chinese Renminbi", "CNY"));
        currencies.add(new Currency(null, "Colombian Peso", "COP", "Colombian Peso", "COP"));
        currencies.add(new Currency(null, "Costa Rican Colon", "CRC", "Costa Rican Colon", "CRC"));
        currencies.add(new Currency(null, "Cuban Peso", "CUP", "Cuban Peso", "CUP"));
        currencies.add(new Currency(null, "Cape Verdean Escudo", "CVE", "Cape Verdean Escudo", "CVE"));
        currencies.add(new Currency(null, "Czech Koruna", "CZK", "Czech Koruna", "CZK"));
        currencies.add(new Currency(null, "Djiboutian Franc", "DJF", "Djiboutian Franc", "DJF"));
        currencies.add(new Currency(null, "Danish Krone", "DKK", "Danish Krone", "DKK"));
        currencies.add(new Currency(null, "Dominican Peso", "DOP", "Dominican Peso", "DOP"));
        currencies.add(new Currency(null, "Algerian Dinar", "DZD", "Algerian Dinar", "DZD"));
        currencies.add(new Currency(null, "Egyptian Pound", "EGP", "Egyptian Pound", "EGP"));
        currencies.add(new Currency(null, "Eritrean Nakfa", "ERN", "Eritrean Nakfa", "ERN"));
        currencies.add(new Currency(null, "Ethiopian Birr", "ETB", "Ethiopian Birr", "ETB"));
        currencies.add(new Currency(null, "Euro", "EUR", "Euro", "EUR"));
        currencies.add(new Currency(null, "Fiji Dollar", "FJD", "Fiji Dollar", "FJD"));
        currencies.add(new Currency(null, "Falkland Islands Pound", "FKP", "Falkland Islands Pound", "FKP"));
        currencies.add(new Currency(null, "Faroese Króna", "FOK", "Faroese Króna", "FOK"));
        currencies.add(new Currency(null, "Pound Sterling", "GBP", "Pound Sterling", "GBP"));
        currencies.add(new Currency(null, "Georgian Lari", "GEL", "Georgian Lari", "GEL"));
        currencies.add(new Currency(null, "Guernsey Pound", "GGP", "Guernsey Pound", "GGP"));
        currencies.add(new Currency(null, "Ghanaian Cedi", "GHS", "Ghanaian Cedi", "GHS"));
        currencies.add(new Currency(null, "Gibraltar Pound", "GIP", "Gibraltar Pound", "GIP"));
        currencies.add(new Currency(null, "Gambian Dalasi", "GMD", "Gambian Dalasi", "GMD"));
        currencies.add(new Currency(null, "Guinean Franc", "GNF", "Guinean Franc", "GNF"));
        currencies.add(new Currency(null, "Guatemalan Quetzal", "GTQ", "Guatemalan Quetzal", "GTQ"));
        currencies.add(new Currency(null, "Guyanese Dollar", "GYD", "Guyanese Dollar", "GYD"));
        currencies.add(new Currency(null, "Hong Kong Dollar", "HKD", "Hong Kong Dollar", "HKD"));
        currencies.add(new Currency(null, "Honduran Lempira", "HNL", "Honduran Lempira", "HNL"));
        currencies.add(new Currency(null, "Croatian Kuna", "HRK", "Croatian Kuna", "HRK"));
        currencies.add(new Currency(null, "Haitian Gourde", "HTG", "Haitian Gourde", "HTG"));
        currencies.add(new Currency(null, "Hungarian Forint", "HUF", "Hungarian Forint", "HUF"));
        currencies.add(new Currency(null, "Indonesian Rupiah", "IDR", "Indonesian Rupiah", "IDR"));
        currencies.add(new Currency(null, "Israeli New Shekel", "ILS", "Israeli New Shekel", "ILS"));
        currencies.add(new Currency(null, "Manx Pound", "IMP", "Manx Pound", "IMP"));
        currencies.add(new Currency(null, "Indian Rupee", "INR", "Indian Rupee", "INR"));
        currencies.add(new Currency(null, "Iraqi Dinar", "IQD", "Iraqi Dinar", "IQD"));
        currencies.add(new Currency(null, "Iranian Rial", "IRR", "Iranian Rial", "IRR"));
        currencies.add(new Currency(null, "Icelandic Króna", "ISK", "Icelandic Króna", "ISK"));
        currencies.add(new Currency(null, "Jersey Pound", "JEP", "Jersey Pound", "JEP"));
        currencies.add(new Currency(null, "Jamaican Dollar", "JMD", "Jamaican Dollar", "JMD"));
        currencies.add(new Currency(null, "Jordanian Dinar", "JOD", "Jordanian Dinar", "JOD"));
        currencies.add(new Currency(null, "Japanese Yen", "JPY", "Japanese Yen", "JPY"));
        currencies.add(new Currency(null, "Kenyan Shilling", "KES", "Kenyan Shilling", "KES"));
        currencies.add(new Currency(null, "Kyrgyzstani Som", "KGS", "Kyrgyzstani Som", "KGS"));
        currencies.add(new Currency(null, "Cambodian Riel", "KHR", "Cambodian Riel", "KHR"));
        currencies.add(new Currency(null, "Kiribati Dollar", "KID", "Kiribati Dollar", "KID"));
        currencies.add(new Currency(null, "Comorian Franc", "KMF", "Comorian Franc", "KMF"));
        currencies.add(new Currency(null, "South Korean Won", "KRW", "South Korean Won", "KRW"));
        currencies.add(new Currency(null, "Kuwaiti Dinar", "KWD", "Kuwaiti Dinar", "KWD"));
        currencies.add(new Currency(null, "Cayman Islands Dollar", "KYD", "Cayman Islands Dollar", "KYD"));
        currencies.add(new Currency(null, "Kazakhstani Tenge", "KZT", "Kazakhstani Tenge", "KZT"));
        currencies.add(new Currency(null, "Lao Kip", "LAK", "Lao Kip", "LAK"));
        currencies.add(new Currency(null, "Lebanese Pound", "LBP", "Lebanese Pound", "LBP"));
        currencies.add(new Currency(null, "Sri Lankan Rupee", "LKR", "Sri Lankan Rupee", "LKR"));
        currencies.add(new Currency(null, "Liberian Dollar", "LRD", "Liberian Dollar", "LRD"));
        currencies.add(new Currency(null, "Lesotho Loti", "LSL", "Lesotho Loti", "LSL"));
        currencies.add(new Currency(null, "Libyan Dinar", "LYD", "Libyan Dinar", "LYD"));
        currencies.add(new Currency(null, "Moroccan Dirham", "MAD", "Moroccan Dirham", "MAD"));
        currencies.add(new Currency(null, "Moldovan Leu", "MDL", "Moldovan Leu", "MDL"));
        currencies.add(new Currency(null, "Malagasy Ariary", "MGA", "Malagasy Ariary", "MGA"));
        currencies.add(new Currency(null, "Macedonian Denar", "MKD", "Macedonian Denar", "MKD"));
        currencies.add(new Currency(null, "Burmese Kyat", "MMK", "Burmese Kyat", "MMK"));
        currencies.add(new Currency(null, "Mongolian Tögrög", "MNT", "Mongolian Tögrög", "MNT"));
        currencies.add(new Currency(null, "Macanese Pataca", "MOP", "Macanese Pataca", "MOP"));
        currencies.add(new Currency(null, "Mauritanian Ouguiya", "MRU", "Mauritanian Ouguiya", "MRU"));
        currencies.add(new Currency(null, "Mauritian Rupee", "MUR", "Mauritian Rupee", "MUR"));
        currencies.add(new Currency(null, "Maldivian Rufiyaa", "MVR", "Maldivian Rufiyaa", "MVR"));
        currencies.add(new Currency(null, "Malawian Kwacha", "MWK", "Malawian Kwacha", "MWK"));
        currencies.add(new Currency(null, "Mexican Peso", "MXN", "Mexican Peso", "MXN"));
        currencies.add(new Currency(null, "Malaysian Ringgit", "MYR", "Malaysian Ringgit", "MYR"));
        currencies.add(new Currency(null, "Mozambican Metical", "MZN", "Mozambican Metical", "MZN"));
        currencies.add(new Currency(null, "Namibian Dollar", "NAD", "Namibian Dollar", "NAD"));
        currencies.add(new Currency(null, "Nigerian Naira", "NGN", "Nigerian Naira", "NGN"));
        currencies.add(new Currency(null, "Nicaraguan Córdoba", "NIO", "Nicaraguan Córdoba", "NIO"));
        currencies.add(new Currency(null, "Norwegian Krone", "NOK", "Norwegian Krone", "NOK"));
        currencies.add(new Currency(null, "Nepalese Rupee", "NPR", "Nepalese Rupee", "NPR"));
        currencies.add(new Currency(null, "New Zealand Dollar", "NZD", "New Zealand Dollar", "NZD"));
        currencies.add(new Currency(null, "Omani Rial", "OMR", "Omani Rial", "OMR"));
        currencies.add(new Currency(null, "Panamanian Balboa", "PAB", "Panamanian Balboa", "PAB"));
        currencies.add(new Currency(null, "Peruvian Sol", "PEN", "Peruvian Sol", "PEN"));
        currencies.add(new Currency(null, "Papua New Guinean Kina", "PGK", "Papua New Guinean Kina", "PGK"));
        currencies.add(new Currency(null, "Philippine Peso", "PHP", "Philippine Peso", "PHP"));
        currencies.add(new Currency(null, "Pakistani Rupee", "PKR", "Pakistani Rupee", "PKR"));
        currencies.add(new Currency(null, "Polish Złoty", "PLN", "Polish Złoty", "PLN"));
        currencies.add(new Currency(null, "Paraguayan Guarani", "PYG", "Paraguayan Guarani", "PYG"));
        currencies.add(new Currency(null, "Qatari Riyal", "QAR", "Qatari Riyal", "QAR"));
        currencies.add(new Currency(null, "Romanian Leu", "RON", "Romanian Leu", "RON"));
        currencies.add(new Currency(null, "Serbian Dinar", "RSD", "Serbian Dinar", "RSD"));
        currencies.add(new Currency(null, "Russian Ruble", "RUB", "Russian Ruble", "RUB"));
        currencies.add(new Currency(null, "Rwandan Franc", "RWF", "Rwandan Franc", "RWF"));
        currencies.add(new Currency(null, "Saudi Riyal", "SAR", "Saudi Riyal", "SAR"));
        currencies.add(new Currency(null, "Solomon Islands Dollar", "SBD", "Solomon Islands Dollar", "SBD"));
        currencies.add(new Currency(null, "Seychellois Rupee", "SCR", "Seychellois Rupee", "SCR"));
        currencies.add(new Currency(null, "Sudanese Pound", "SDG", "Sudanese Pound", "SDG"));
        currencies.add(new Currency(null, "Swedish Krona", "SEK", "Swedish Krona", "SEK"));
        currencies.add(new Currency(null, "Singapore Dollar", "SGD", "Singapore Dollar", "SGD"));
        currencies.add(new Currency(null, "Saint Helena Pound", "SHP", "Saint Helena Pound", "SHP"));
        currencies.add(new Currency(null, "Sierra Leonean Leone", "SLL", "Sierra Leonean Leone", "SLL"));
        currencies.add(new Currency(null, "Somali Shilling", "SOS", "Somali Shilling", "SOS"));
        currencies.add(new Currency(null, "Surinamese Dollar", "SRD", "Surinamese Dollar", "SRD"));
        currencies.add(new Currency(null, "South Sudanese Pound", "SSP", "South Sudanese Pound", "SSP"));
        currencies.add(new Currency(null, "São Tomé and Príncipe Dobra", "STD", "São Tomé and Príncipe Dobra", "STD"));
        currencies.add(new Currency(null, "Syrian Pound", "SYP", "Syrian Pound", "SYP"));
        currencies.add(new Currency(null, "Swazi Lilangeni", "SZL", "Swazi Lilangeni", "SZL"));
        currencies.add(new Currency(null, "Thai Baht", "THB", "Thai Baht", "THB"));
        currencies.add(new Currency(null, "Tajikistani Somoni", "TJS", "Tajikistani Somoni", "TJS"));
        currencies.add(new Currency(null, "Turkmenistan Manat", "TMT", "Turkmenistan Manat", "TMT"));
        currencies.add(new Currency(null, "Tunisian Dinar", "TND", "Tunisian Dinar", "TND"));
        currencies.add(new Currency(null, "Tongan Paʻanga", "TOP", "Tongan Paʻanga", "TOP"));
        currencies.add(new Currency(null, "Turkish Lira", "TRY", "Turkish Lira", "TRY"));
        currencies.add(new Currency(null, "Trinidad and Tobago Dollar", "TTD", "Trinidad and Tobago Dollar", "TTD"));
        currencies.add(new Currency(null, "New Taiwan Dollar", "TWD", "New Taiwan Dollar", "TWD"));
        currencies.add(new Currency(null, "Tanzanian Shilling", "TZS", "Tanzanian Shilling", "TZS"));
        currencies.add(new Currency(null, "Ukrainian Hryvnia", "UAH", "Ukrainian Hryvnia", "UAH"));
        currencies.add(new Currency(null, "Ugandan Shilling", "UGX", "Ugandan Shilling", "UGX"));
        currencies.add(new Currency(null, "United States Dollar", "USD", "United States Dollar", "USD"));
        currencies.add(new Currency(null, "Uruguayan Peso", "UYU", "Uruguayan Peso", "UYU"));
        currencies.add(new Currency(null, "Uzbekistan Som", "UZS", "Uzbekistan Som", "UZS"));
        currencies.add(new Currency(null, "Venezuelan Bolívar", "VES", "Venezuelan Bolívar", "VES"));
        currencies.add(new Currency(null, "Vietnamese Đồng", "VND", "Vietnamese Đồng", "VND"));
        currencies.add(new Currency(null, "Vanuatu Vatu", "VUV", "Vanuatu Vatu", "VUV"));
        currencies.add(new Currency(null, "Samoan Tala", "WST", "Samoan Tala", "WST"));
        currencies.add(new Currency(null, "Central African CFA Franc", "XAF", "Central African CFA Franc", "XAF"));
        currencies.add(new Currency(null, "East Caribbean Dollar", "XCD", "East Caribbean Dollar", "XCD"));
        currencies.add(new Currency(null, "West African CFA franc", "XOF", "West African CFA franc", "XOF"));
        currencies.add(new Currency(null, "CFA Franc", "XPF", "CFA Franc", "XPF"));
        currencies.add(new Currency(null, "Yemeni Rial", "YER", "Yemeni Rial", "YER"));
        currencies.add(new Currency(null, "South African Rand", "ZAR", "South African Rand", "ZAR"));
        currencies.add(new Currency(null, "Zambian Kwacha", "ZMW", "Zambian Kwacha", "ZMW"));
        currencies.add(new Currency(null, "Zimbabwean Dollar", "ZWL", "Zimbabwean Dollar", "ZWL"));
        return currencies;
    }

}

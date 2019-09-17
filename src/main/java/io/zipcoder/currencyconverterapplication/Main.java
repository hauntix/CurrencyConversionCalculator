package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.USDollar;

public class Main {
    public static void main(String[] args) {
        ConvertibleCurrency money = new USDollar();

        double convertedValue = CurrencyConverter.convert(2.00, money, CurrencyType.EURO);

        System.out.println(convertedValue);
    }
}

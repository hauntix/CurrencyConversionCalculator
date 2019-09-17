package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    /**
     * Static method for converting between to currency types
     * @param amountOfBaseCurrency how much money is being converted
     * @param sourceCurrencyType the base currency type
     * @param targetCurrencyType the target currency type we want to convert to
     * @return the calculated money after exchange
     */
    public static Double convert(Double amountOfBaseCurrency, ConvertibleCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
        return sourceCurrencyType.convert(targetCurrencyType) * amountOfBaseCurrency;
    }
}

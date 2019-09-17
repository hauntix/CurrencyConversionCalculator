package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class USDollar implements ConvertibleCurrency {
    private CurrencyType currencyType = CurrencyType.US_DOLLAR;

    public CurrencyType getType() {
        return currencyType;
    }
}

package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertibleCurrency {
    private CurrencyType currencyType = CurrencyType.AUSTRALIAN_DOLLAR;

    public CurrencyType getType() {
        return currencyType;
    }
}

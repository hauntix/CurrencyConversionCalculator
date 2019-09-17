package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Pound implements ConvertibleCurrency {
    private CurrencyType currencyType = CurrencyType.POUND;

    public CurrencyType getType() {
        return currencyType;
    }
}

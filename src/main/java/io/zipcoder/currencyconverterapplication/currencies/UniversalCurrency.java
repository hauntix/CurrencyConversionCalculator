package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertibleCurrency {
    private CurrencyType currencyType = CurrencyType.UNIVERSAL_CURRENCY;

    public CurrencyType getType() {
        return currencyType;
    }
}

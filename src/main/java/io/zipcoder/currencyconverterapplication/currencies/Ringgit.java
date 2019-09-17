package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertibleCurrency {
    private CurrencyType currencyType = CurrencyType.RINGGIT;

    public CurrencyType getType() {
        return currencyType;
    }
}

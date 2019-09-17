package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Franc implements ConvertibleCurrency {
    private CurrencyType currencyType = CurrencyType.FRANC;

    public CurrencyType getType() {
        return currencyType;
    }
}

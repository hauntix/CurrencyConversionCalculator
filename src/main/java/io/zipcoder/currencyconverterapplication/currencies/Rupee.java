package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertibleCurrency {
    private CurrencyType currencyType = CurrencyType.RUPEE;

    public CurrencyType getType() {
        return currencyType;
    }
}

package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertibleCurrency {
    private CurrencyType currencyType = CurrencyType.CANADIAN_DOLLAR;

    public CurrencyType getType() {
        return currencyType;
    }
}

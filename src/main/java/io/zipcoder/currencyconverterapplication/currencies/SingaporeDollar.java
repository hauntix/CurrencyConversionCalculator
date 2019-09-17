package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertibleCurrency {
    private CurrencyType currencyType = CurrencyType.SINGAPORE_DOLLAR;

    public CurrencyType getType() {
        return currencyType;
    }
}

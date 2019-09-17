package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertibleCurrency {
    private CurrencyType currencyType = CurrencyType.YEN;

    public CurrencyType getType() {
        return currencyType;
    }
}

package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertibleCurrency {
    private CurrencyType currencyType = CurrencyType.EURO;

    public CurrencyType getType() {
        return currencyType;
    }
}

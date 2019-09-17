package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertibleCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertibleCurrency {
    private CurrencyType currencyType = CurrencyType.CHINESE_YR;

    public CurrencyType getType() {
        return currencyType;
    }
}

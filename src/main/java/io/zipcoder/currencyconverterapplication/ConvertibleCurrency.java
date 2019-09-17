package io.zipcoder.currencyconverterapplication;

public interface ConvertibleCurrency {
    default Double convert(CurrencyType currencyType) {
        // Divide the target currency rate by the rate of the class calling this method
        // i.e. if converting USD to AUD
        // AustralianDollar.getRate() / CurrencyType.getTyoeOfCurrency(USDollar).getRate()
        return currencyType.getRate() / CurrencyType.getTypeOfCurrency(this).getRate();
    }

     CurrencyType getType();
}

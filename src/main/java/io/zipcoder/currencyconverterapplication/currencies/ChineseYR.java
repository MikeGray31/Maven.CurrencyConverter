package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {

    private CurrencyType type = CurrencyType.CHINESE_YR;

    public CurrencyType getCurrencyType() {
        return type;
    }

}

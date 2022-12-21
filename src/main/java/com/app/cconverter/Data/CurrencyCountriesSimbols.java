package com.app.cconverter.Data;

public enum CurrencyCountriesSimbols {
    DOLLAR("dollar","us$"),
    EURO("euro","Є$"),
    POUNDSTERLING("libra_sterlina","£$"),
    YEN_JP("yen_jp","¥$"),
    WON_SURCOREAN("won_surcorean","₩$");
    private final String key;
    private final String value;

    CurrencyCountriesSimbols(String key,String value){
        this.key=key;
        this.value=value;
    }

    public String getKey(){
        return key;
    }
    public String getValue(){
        return value;
    }
}

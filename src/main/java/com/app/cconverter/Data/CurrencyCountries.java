package com.app.cconverter.Data;

import java.util.Vector;

public enum CurrencyCountries {

    NONE("none",null),
    DOLLAR("dollar",0.0058),
    EURO("euro",0.0054);

    private final String key;
    private final Double value;

    CurrencyCountries(String key, Double value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public Double getValue() {
        return value;
    }
    public static  Vector<String> currencies(){
        Vector<String> m = new Vector<>(CurrencyCountries.values().length);
        for(CurrencyCountries d:CurrencyCountries.values()){
            m.addElement(d.getKey());
        }
        return m;
    }
}

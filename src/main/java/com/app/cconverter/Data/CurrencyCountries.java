package com.app.cconverter.Data;

import java.util.Vector;

public enum CurrencyCountries {

    DOLLAR("dollar",172.70);

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
        m.addElement(null);
        for(CurrencyCountries d:CurrencyCountries.values()){
            m.addElement(d.getKey());
        }
        return m;
    }
}

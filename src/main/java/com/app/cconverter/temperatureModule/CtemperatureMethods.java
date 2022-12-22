package com.app.cconverter.temperatureModule;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.app.cconverter.utils.Rounded;

public class CtemperatureMethods {
    private static final List<String> options= Arrays.asList(
        "From_celsius_to_fahrenheit","From_celsius_to_kelvin","From_celsius_to_rankine",
        "From_fahrenheit_to_celsius","From_fahrenheit_to_kelvin","From_fahrenheit_to_rankine",
        "From_rankine_to_fahrenheit","From_rankine_to_kelvin","From_rankine_to_celsius",
        "From_kelvin_to_celsius","From_kelvin_to_rankine","From_kelvin_to_fahrenheit"
        );
  
    public CtemperatureMethods() {}

    protected static Double celsius_to_fahrenheit(Double value){ return Rounded.rounded((value*1.8)+32);}
    protected static Double celsius_to_kelvin(Double value){ return Rounded.rounded(value+273.15);}
    protected static Double celsius_to_rankine(Double value){ return Rounded.rounded((value*9/5)+491.67);}

    protected static Double fahrenheit_to_celsius(Double value){ return Rounded.rounded((value-32)/1.8);}
    protected static Double fahrenheit_to_kelvin(Double value){ return Rounded.rounded(((value-32)*5/9)+273.15);}
    protected static Double fahrenheit_to_rankine(Double value){ return Rounded.rounded(value+459.67);}

    protected static Double rankine_to_celsius(Double value){ return Rounded.rounded((value-491.67)*5/9);}
    protected static Double rankine_to_kelvin(Double value){ return Rounded.rounded(value*5/9);}
    protected static Double rankine_to_fahrenheit(Double value){ return Rounded.rounded(value-459.67);}

    protected static Double kelvin_to_celsius(Double value){ return Rounded.rounded(value-273.15);}
    protected static Double kelvin_to_rankine(Double value){ return Rounded.rounded(value*1.8);}
    protected static Double kelvin_to_fahrenheit(Double value){ return Rounded.rounded(((value-273.15)*9/5)+32);}

    public static Vector<String> getOptions(){
        Vector<String> vector= new Vector<>(options);
        return vector;
      }

}

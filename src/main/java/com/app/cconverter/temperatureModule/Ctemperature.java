package com.app.cconverter.temperatureModule;

import java.util.Vector;
import com.app.cconverter.currencymodule.CCurrency;


public class Ctemperature extends CCurrency {

    @Override
    public String converterAction(String type, Double value) {

        return switch(type){
            case "From_celsius_to_fahrenheit" -> CtemperatureMethods.celsius_to_fahrenheit(value)+" °F";
            case "From_celsius_to_kelvin" -> CtemperatureMethods.celsius_to_kelvin(value)+" K";
            case "From_celsius_to_rankine" -> CtemperatureMethods.celsius_to_rankine(value)+" °R";
            case "From_fahrenheit_to_celsius" -> CtemperatureMethods.fahrenheit_to_celsius(value)+" °C";
            case "From_fahrenheit_to_kelvin" -> CtemperatureMethods.fahrenheit_to_kelvin(value)+" K";
            case "From_fahrenheit_to_rankine"-> CtemperatureMethods.fahrenheit_to_rankine(value)+" °R";
            case "From_rankine_to_fahrenheit"-> CtemperatureMethods.rankine_to_fahrenheit(value)+" °F";
            case "From_rankine_to_celsius" ->CtemperatureMethods.rankine_to_celsius(value)+" °C";
            case "From_rankine_to_kelvin" -> CtemperatureMethods.rankine_to_kelvin(value)+ " K";
            case "From_kelvin_to_celsius"-> CtemperatureMethods.kelvin_to_celsius(value)+" °C";
            case "From_kelvin_to_rankine"-> CtemperatureMethods.kelvin_to_rankine(value)+" °R";
            case "From_kelvin_to_fahrenheit"-> CtemperatureMethods.kelvin_to_fahrenheit(value)+" °F";
            default -> "";
        };
    }

    @Override
    public Vector<String> getOptions() {
        
        return CtemperatureMethods.getOptions();
    }    
    
}

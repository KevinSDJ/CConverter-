package com.app.cconverter.currencymodule;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/*
 * 
 * - Convertir de la moneda de tu país a Dólar
   - Convertir de la moneda de tu país  a Euros
   - Convertir de la moneda de tu país  a Libras Esterlinas
   - Convertir de la moneda de tu país  a Yen Japonés
   - Convertir de la moneda de tu país  a Won sul-coreano
*/

public class CCurrencyMethods {
    private static final List<String> options= Arrays.asList(
      "local_to_dollar","local_to_Euro","local_to_PoundSterling",
      "local_to_YenJp","local_to_Won sur corea"
      );

    public CCurrencyMethods() {}

    protected static Double FromLocal_To_Dollar(Double value){ return value;}

    protected static Double FromLocal_To_Euro(Double value){ return value;}

    protected static Double FromLocal_To_PoundSterling(Double value){ return value;};

    protected static Double FromLocal_To_YenJp(Double value){ return value;}

    protected static Double FromLocal_To_WonSrCorea(Double value){ return value;}
    
    /*
     * reverse methods
    */
    protected static Double FromDollar_to_Local(Double value){ return value;}

    protected static Double FromEuro_to_Local(Double value){ return value;}

    protected static Double FromPoundSterling_to_Local(Double value){ return value;};

    protected static Double FromYenJp_to_Local(Double value){ return value;}

    protected static Double FromWonSrCorea_to_Local(Double value){ return value;}

    protected static Vector<String> getOptions(){
      Vector<String> vector= new Vector<>(options);
      return vector;
    }

}

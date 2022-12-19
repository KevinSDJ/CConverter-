package com.app.cconverter.currencymodule;


/*
 * 
 * - Convertir de la moneda de tu país a Dólar
   - Convertir de la moneda de tu país  a Euros
   - Convertir de la moneda de tu país  a Libras Esterlinas
   - Convertir de la moneda de tu país  a Yen Japonés
   - Convertir de la moneda de tu país  a Won sul-coreano
*/

public class CCurrencyMethods {

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

}

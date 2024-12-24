package utilitarios;

public class CurrencyConverter {
    public static double  IOF= 0.06;

    public static double dollarToReal(Double amount, Double dollarPrice){
        return (1.0+IOF)*(dollarPrice*amount);
    }

}

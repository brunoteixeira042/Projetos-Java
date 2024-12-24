import utilitarios.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double amount = sc.nextDouble();


        double valor = CurrencyConverter.dollarToReal(amount,dollarPrice);
        System.out.printf("mount to be paid in reais %.2f",valor);
        sc.close();
    }
}
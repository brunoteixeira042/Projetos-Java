import java.util.Locale;
import java.util.Scanner;

public class NumerosNegativos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] arrayNumeros = new int [n];
        for (int i = 0; i <arrayNumeros.length ; i++) {
            System.out.print("Digite um numero: ");
            arrayNumeros[i] = sc.nextInt();

        }
        System.out.println("NUMEROS NEGATIVOS");
        for (int Numero : arrayNumeros) {
            if (Numero < 0) {
                System.out.println(Numero);
            }
        }
        sc.close();

    }
}
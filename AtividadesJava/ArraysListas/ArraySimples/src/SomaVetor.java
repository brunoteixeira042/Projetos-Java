import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        int [] arraySoma = new int[n];
        int soma = 0;
        int media=0;

        for (int i = 0; i <arraySoma.length ; i++) {
            System.out.print("Digite um numero: ");
            arraySoma[i] = sc.nextInt();
        }
        System.out.print("VALORES = ");
        for (int numero : arraySoma){
            soma += numero;
            media = soma/arraySoma.length;
            System.out.print(" "+numero);
        }
        System.out.println();
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);


    }
}

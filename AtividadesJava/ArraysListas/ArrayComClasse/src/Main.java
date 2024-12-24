import entidades.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
         Aluguel [] arrayQuartos = new Aluguel[10];
        System.out.println("Quantos quartos serão alugados? ");
         int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Aluguel #"+(i+1)+":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int numero = sc.nextInt();
            Aluguel quarto = new Aluguel(nome,email);
            arrayQuartos[numero]=quarto;
        }
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i <10; i++) {
            if(arrayQuartos[i]!=null){
            System.out.println(i+": "+arrayQuartos[i]);
            }
        }
        sc.close();
    }
}
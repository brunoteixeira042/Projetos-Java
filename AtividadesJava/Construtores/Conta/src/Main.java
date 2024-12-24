import entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Insira o número da conta: \n");
        int numero = sc.nextInt();
        System.out.print("Insira o titular da conta: \n");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Há um depósito inicial (s/n)? \n");
        String DepositoInicial= sc.nextLine();
        if (DepositoInicial.equals("s")){
            System.out.print("Insira o valor do depósito inicial: ");
           double valor = sc.nextDouble();
            conta = new Conta(numero,nome,valor);
        }else {
            conta = new Conta(numero,nome);
        }


        System.out.println(conta);
        int opcao = 1;
        while (opcao !=0){
            System.out.print("Insira um valor de depósito: ");
            conta.depositar(sc.nextDouble());
            System.out.println(conta);
            System.out.println("Dados da conta atualizados: ");
            System.out.print("Insira um valor de saque: ");
            conta.sacar(sc.nextDouble());
            System.out.println("Dados da conta atualizados: ");
            System.out.println(conta);
            System.out.println("Deseja continuar pressione " +
                    "qualquer tecla diferente de 0");
            opcao = sc.nextInt();

        }
        sc.close();

    }
}
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome = "Bruno Sousa";
        String tipoDeConta = "Corrente";
        Double saldoDaConta = 2500.00;
        int opcao = 0;
        System.out.printf("""
                ***************************
                Dados inicias do cliente:
                
                Nome:                %s
                Tipo de Conta:       %s
                Saldo de Conta:      %.2f
                ****************************
                """,nome,tipoDeConta,saldoDaConta);
        while (opcao != 4){
            System.out.printf("""
               Operação:
               1-Consultar Saldo
               2-Receber valor
               3-transferir valor
               4- Sair
               Digite a opção desejada \n
               """);

            opcao = input.nextInt();
            if(opcao==1){
                System.out.printf("Seu saldo é igual %.2f \n",saldoDaConta);
            }
            if (opcao==2){
                System.out.println("Informe o valor a receber");
                saldoDaConta += input.nextDouble();
                System.out.printf("Saldo atualizado %.2f \n",saldoDaConta);
            }
            if (opcao==3){
                System.out.println("Informe o valor a transferir");
                Double valorTranferencia= input.nextDouble();
                if(valorTranferencia<=saldoDaConta){
                    saldoDaConta -= valorTranferencia;
                    System.out.printf("Saldo atualizado %.2f \n",saldoDaConta);
                }
            }
            if (opcao!=4){
                System.out.println("opção invalida");
            }

        }

    }
}

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        String[] arrayNomes = new String[n];
        int[] arrayIdade = new int [n];
        double [] arrayAlturas = new double[n];
        for (int i = 0; i <n ; i++) {
                System.out.printf("Dados da %da pessoa: \n",i+1 );
                System.out.print("Nome: ");
                sc.nextLine();
                arrayNomes[i] = sc.nextLine();
                System.out.print("Idade: ");
                arrayIdade[i] = sc.nextInt();
                System.out.print("Altura: ");
                arrayAlturas[i] = sc.nextDouble();
        }
        double somaAltura=0;
        double menosDe16=0;
        for (int i = 0; i <arrayAlturas.length ; i++) {
           somaAltura += arrayAlturas[i];
           if(arrayIdade[i]<16){
            menosDe16++;
           }
        }
        double mediaAltura = somaAltura/n;
        double percentualMenos16 = ((double) menosDe16/n)*100;

        System.out.printf("Altura média: %.2f \n",mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% \n",percentualMenos16);
        for (int i = 0; i <n ; i++) {
            if (arrayIdade[i] < 16) {
                System.out.println(arrayNomes[i]);
            }
        }
        sc.close();
    }

}

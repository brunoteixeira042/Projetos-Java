import entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> listaFuncionario = new ArrayList<>();
        System.out.print("Quantos empregados serão registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i <n; i++) {
            System.out.println("Empregado #"+(1+i)+":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            Funcionario funcionario = new Funcionario(id,nome,salario);
            listaFuncionario.add(funcionario);
        }
        System.out.print("Insira o ID do empregado que terá aumento salarial: ");
        Integer id = sc.nextInt();
        Funcionario funcionario = listaFuncionario.stream().filter(x->x.getId().equals(id)).findFirst().orElse(null);
        if (funcionario != null){
            System.out.print("Insira a porcentagem: ");
            Double aumento = sc.nextDouble();
            funcionario.aumentoSalario(aumento);

        }else {
            System.out.println("Este ID não existe!");
        }
        System.out.println("Lista de empregados:");
        for (Funcionario f : listaFuncionario){
            System.out.println(f);
        }

        sc.close();
    }
}
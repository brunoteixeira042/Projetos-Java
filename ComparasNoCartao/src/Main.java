import entidades.CartaCredito;
import entidades.Compra;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Compra> listaCompra = new ArrayList<>();
        CartaCredito meuCartao = new CartaCredito();
        Compra novoCompra;
        int opcao=1;
        System.out.println("Digite o limite do cartão: ");
        meuCartao.AdicionarLimite(sc.nextDouble());
        do {
            System.out.println("Digite a descrição do produto: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o valor da compra: ");
            Double valor = sc.nextDouble();
            meuCartao.retirarLimite(valor);
            if(valor<=meuCartao.getValorCartao()){
            novoCompra = new Compra(nome,valor);
            listaCompra.add(novoCompra);
            }
            System.out.println("Digite 0 para Sair ou 1 para continuar");
            opcao = sc.nextInt();
        }while (opcao!=0);
        listaCompra.sort(Comparator.comparing(Compra::getValorCompra));
        System.out.println("********************");
        System.out.println("COMPRAS REALIZADAS");
        for (Compra compra: listaCompra){
            System.out.println(compra);
        }
        System.out.println("********************");
        System.out.println("Limite do disponível "+meuCartao.getValorCartao());
        sc.close();

    }
}
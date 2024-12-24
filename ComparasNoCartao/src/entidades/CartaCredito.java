package entidades;

public class CartaCredito {
   private Double valorCartao;


    public Double getValorCartao() {
        return valorCartao;
    }

    public void retirarLimite(Double valor){
        if (valor>valorCartao){
            System.out.println("Saldo insuficiente");
        }else {
            valorCartao-= valor;
            System.out.println("Compra realizada");
        }


    }
    public void AdicionarLimite(Double valor){
            valorCartao = valor;
    }
}

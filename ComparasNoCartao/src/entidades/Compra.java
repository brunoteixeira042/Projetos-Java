package entidades;

public class Compra {
    private Double valorCompra;
    private String nomeDoProduto;

    public Compra(String nomeDoProduto,Double valorCompra) {
        this.nomeDoProduto = nomeDoProduto;
        this.valorCompra = valorCompra;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    @Override
    public String toString() {
        return getNomeDoProduto() +" - "
                + getValorCompra();
    }
}

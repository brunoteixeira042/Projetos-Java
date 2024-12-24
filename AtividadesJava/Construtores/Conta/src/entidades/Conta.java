package entidades;

public class Conta {
    private int numeroConta;
    private String nome;
    private double saldo;

    public Conta(int numeroConta, String nome, double depositar) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        depositar(saldo);
    }

    public Conta(int numeroConta, String nome){
            this.numeroConta =  numeroConta;
            this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double deposito) {
        return  this.saldo += deposito;
    }
    public double sacar(double sacar) {
        return this.saldo -= sacar+5;
    }

    @Override
    public String toString() {
        return "Conta " + numeroConta +
                " Titular: " + nome +
                " Saldo: " +saldo;
    }
}

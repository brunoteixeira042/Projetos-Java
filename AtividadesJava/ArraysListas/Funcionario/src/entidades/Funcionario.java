package entidades;

import java.text.Format;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void aumentoSalario(Double aumento){
        salario+=salario*(aumento/100);
    }

    @Override
    public String toString() {
        return id+ ", " + nome +", "+String.format("%.2f",salario);
    }
}

package entidades;

public class Aluguel {
    private String nome;
    private String email;
    public Aluguel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return getNome()+", "+
                getEmail();
    }
}

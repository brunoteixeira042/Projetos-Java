package audio.modelos;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducao;
    private int curtidadas;
    private int classificao;

    public void curte(){
      curtidadas++;
    }
    public  void reproduz(){
        totalDeReproducao++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getClassificao() {
        return classificao;
    }


    public int getCurtidadas() {
        return curtidadas;
    }

}

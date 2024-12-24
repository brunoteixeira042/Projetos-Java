package audio.principal;

import audio.modelos.MinhaPreferidas;
import audio.modelos.Musica;
import audio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("PAREDÕES");
        minhaMusica.setArtista("Grelo");
        for (int i = 0; i <= 50; i++) {
            minhaMusica.reproduz();
        }
        System.out.println("Nome do artista: "+minhaMusica.getArtista());
        System.out.println("Nome da música: "+minhaMusica.getTitulo());
        System.out.println("Classifição da Música: "+minhaMusica.getClassificao());

        Podcast meupodcast = new Podcast();

        for (int i = 0; i <=50 ; i++) {
            meupodcast.curte();
        }
        meupodcast.setTitulo("Experience Podcast");
        meupodcast.setApresentador("Guanabara");
        System.out.println(" ");
        System.out.println("Nome do Apresentador: "+meupodcast.getApresentador());
        System.out.println("Nome do Podcast: "+meupodcast.getTitulo());
        System.out.println("Classifição do Podcast: "+meupodcast.getClassificao());
        MinhaPreferidas minhaPreferidas = new MinhaPreferidas();
        minhaPreferidas.inclui(minhaMusica);
        minhaPreferidas.inclui(meupodcast);

    }
}

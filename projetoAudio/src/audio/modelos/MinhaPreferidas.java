package audio.modelos;

public class MinhaPreferidas {

   public void inclui(Audio audio){
       if(audio.getClassificao()<=9){
           System.out.println(audio.getTitulo()+ " todo mundo está curtindo");
       }else{
           System.out.println(audio.getTitulo()+" é um sucesso absoluto");
       }

   }

}

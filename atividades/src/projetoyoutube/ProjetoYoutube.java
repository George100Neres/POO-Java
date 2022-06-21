package projetoyoutube;

public class ProjetoYoutube {
   public static void main(String[] args) {
	  Video v[] = new Video[3];
	  v[0] = new Video("AUla 1 de POO");
	  v[1] = new Video("AUla 12 de PHP" );
	  v[2] = new Video("AUla 10 de HTML");
	  
	 
     Gafanhoto g[] = new Gafanhoto[2];
     g[0] = new Gafanhoto("Jubileu", 22, "M", "juba" );
     g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
	  
     // mesmo gafanho,assitindo outro video
     Visualizacao vis[] = new Visualizacao[5];
     vis[0] = new Visualizacao(g[0], v[2]); // Jubileu assiste HTML
     vis[0].avaliar();
     System.out.println(vis[0].toString());
     
     vis[1] = new Visualizacao(g[0], v[1]); // // Jubileu assiste PHP
     vis[0].avaliar(35.05f);
     System.out.println(vis[1].toString());
     
     
     
   }
}

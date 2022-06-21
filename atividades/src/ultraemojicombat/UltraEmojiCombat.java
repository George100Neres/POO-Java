package ultraemojicombat;

public class UltraEmojiCombat {
  
	public static void main(String[] args) {
	 Lutador l[] = new Lutador[6];
		
	 
	          // Parametros dos lutadores
		l[0] = new Lutador("Pretty Boty", "Franca", 31, 1.75f,
				69,11, 2, 1);
		
		l[1] = new Lutador("PUtscript", "Brasil", 29, 1.68f,
				57.8f, 14, 3, 1);
		
		l[2] = new Lutador("Tony Stark", "EUA", 40, 1.80f,
				70.2f, 10, 0, 2);
		
		l[3] = new Lutador("Deadpool", "Mexico", 35, 2.05f,
				80.5f,15 , 1, 1);
		
		l[4] = new Lutador("Careretedk", "França",19, 1.50f,
				50.69f, 9, 3, 2);
		
		// Obejeto UEC que e da classe Luta
		 Luta UEC01 = new Luta();
		 UEC01.marcarLuta(l[0], l[1]);
		 UEC01.lutar();
		 l[0].status();
		 l[1].status();
		/* acrescentar atributos.
		l[0].status();
		l[0].ganharLuta();;
		*/
		 
	}
}

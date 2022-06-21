package While;

import java.util.Scanner;

public class Dowhile {
 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String texto = "por favor";
		
		do {
		   System.out.println("Voce precisa falar as palavaras mágicas...");
		   
		   System.out.print("Quer sair?");
		   texto = entrada.nextLine();
		   
		} while(!texto.equalsIgnoreCase("por favor"));
		// 
		System.out.println("Obrigado!");
		entrada.close();
	}
}

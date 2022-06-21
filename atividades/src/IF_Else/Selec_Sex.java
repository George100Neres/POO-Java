package IF_Else;

import java.util.Scanner;

public class Selec_Sex {

	
	   public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Entre com uma letra (F ou M):");
			String sexo = entrada.next();
			
			if(sexo.equalsIgnoreCase("f")) {
				System.out.println("F - feminino:");
			  }
			else if(sexo.equalsIgnoreCase("m")) {
				System.out.println("M - Masculino:");
			  }
			else {
				System.out.println("Sexo inválido:");
			  }
   }
}

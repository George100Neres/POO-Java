package IF_Else;

import java.util.Scanner;

public class Media_apro_or_Reprov {
  
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
		System.out.println("Congratularions!!!");
		
		}
		if(media < 7.0  && media >=4.5) {
			System.out.println("Recuperação");
		}
		
		if(media < 4.5 && media >= 0) {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
}

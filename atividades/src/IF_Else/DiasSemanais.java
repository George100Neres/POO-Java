package IF_Else;

import java.util.Scanner;

public class DiasSemanais {
  
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome do dia:");
		
		String dia = entrada.next();
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		} else if("segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}else if("terça".equalsIgnoreCase(dia)) {
			System.out.println(3);
		}else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		} else {
			System.out.println("Dia inválido!");
		}
		
	}
}

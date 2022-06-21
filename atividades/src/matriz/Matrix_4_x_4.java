package matriz;

import java.util.Random;
import java.util.Scanner;

public class Matrix_4_x_4 {
 
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] [] numerosAleatorios = new int [4] [4];
		// Gerando numeros aleatorios
		
		Random numeroRandom = new Random();
		 
		 // Leitura dos Dados
		for (int i=0; i < numerosAleatorios.length; i++) {
			for(int j=0; j < numerosAleatorios.length; j++) {
				// Gerar numeros de 0 a 100.
				numerosAleatorios [i] [j] = numeroRandom.nextInt(100);
			 }
		  }
		int maior = 0;
		int linha = 0;
		int col = 0;
		for (int i=0; i< numerosAleatorios.length; i++) {
			for (int j=0; j<numerosAleatorios.length; j++) {
				if(numerosAleatorios[i] [j] > maior) {
					maior = numerosAleatorios[i] [j];
					linha = i;
					col = j;
				}
			}
		}
		
		for (int i=0; i<numerosAleatorios.length; i++) {
			for (int j=0; j<numerosAleatorios.length; j++) {
				System.out.print(numerosAleatorios[i] [j] + "");
			}
			System.out.println();
		}
	}
}

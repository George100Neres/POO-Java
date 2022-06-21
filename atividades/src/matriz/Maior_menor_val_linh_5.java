package matriz;

import java.util.Random;
import java.util.Scanner;

/* Gere e imrpima uma matriz M 10x10 com valores aleatorios entre 0-9.
 * Após isso indique qual é o maior e o menor valor da linha 5 e qual
 * é o maior e o menor valor da coluna 7
 */
public class Maior_menor_val_linh_5 {
  
	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
		
		int [] [] numerosAleatorios = new int [10] [10];
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
		
		// Matriz da Linha 5
		int maiorL5 = 0;
		int menorL5 = 0;
		int linha5 = 0;
		// ira Percorrer da posicao 0 até o 5
		for(int i=0; i<numerosAleatorios[5].length; i++) {
			// Se o numero aleatorio da linha 5,posicao i,o maior ira receber o valor da linha 5
			if(numerosAleatorios[linha5] [i] > maiorL5) {
				maiorL5 = numerosAleatorios[linha5] [i];
			}
			if(numerosAleatorios[linha5] [i] < menorL5) {
				menorL5  = numerosAleatorios[linha5] [i];
			}
			
		}
		System.out.println("Maior valor da linha 5" + maiorL5);
		System.out.println("Maior valor da linha 5" + menorL5);
		
		int maiorC7 = 0;
		int menorC7 = 0;
		int col7 = 7;
		for (int i=0; i<numerosAleatorios.length; i++) {
			if(numerosAleatorios[i] [col7] > maiorC7) {
				maiorC7 = numerosAleatorios[i] [col7];
				
			}
			if(numerosAleatorios[i] [col7] < menorC7) {
				menorC7 = numerosAleatorios[i] [col7];
				
			}
		}
		
		System.out.println("Maior valor da coluna 7 =" + maiorC7);
		System.out.println("Maior valor da coluna 7 =" + menorC7);
	}
}	

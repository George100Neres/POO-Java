package arrays;

import java.util.Scanner;

/* Criar um vetor A com 5 elementos inteiros.COnstruir um vetor B e mesmo
 * tipo e tamanho com os "mesmos"elementos do vetor A, ou seja, B[i] = A[i]
 */

public class Ex1_Arrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i <vetorA.length; i++) {
			System.out.println("Entre com o valor da posição" + i);
			vetorA[i] = scan.nextInt();
			
			
		}
		System.out.print("vetor A = ");
		   for (int i=0; i<vetorA.length; i++) {
			         System.out.print(vetorA[i] + "");
		   }
		
	}
}

package arrays;

import java.util.Scanner;

/* Criar dois vetores A e B cada um com 10 elementos inteiros.Construir 
 * um vetor C,onde cada elemento de C é a multiplicação dos 
 * respectivos elementos em A e B, ou seja:
 * C[i] = A[i] * B[i]
 */
public class Vet_A_B {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorB.length];
		
		System.out.print("Vetor A");
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor do vetorA da posição"+ i);
			vetorA[i] = scan.nextInt();
		}
		
		System.out.print("Vetor B");
		for (int i=0; i<vetorB.length; i++) {
			System.out.println("Entre com o valor do vetorA da posição"+ i);
			vetorB[i] = scan.nextInt();
		}
		
		for (int i=0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
			System.out.print(vetorC[i] + "");
		}
		
		System.out.println();
	}
}

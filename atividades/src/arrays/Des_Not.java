package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Des_Not {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quanta notas");
		
		int qtddeNotas = entrada.nextInt();
	
		double[] notas = new double[qtddeNotas];
		
		for (int i = 0; i< notas.length; i++) {
			System.out.print("Informe a nota" + i + 1 + " :");
			notas[i] = entrada.nextInt();
		}
		 // Ira fazer a somatoria das nota dos alunos.
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		 // Vai dar a media final do Aluno.
		System.out.println("A média é "+ (total / notas.length));
		entrada.close();
		
	}
}

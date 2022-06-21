package arrays;

import java.util.Arrays;

public class Aluno {
   
	public static final String nomeDisciplinas = null;
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for(int i=0; i < 4; i++) {
			total += notasAlunoA[i];
		}
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(total / notasAlunoA.length);
	}

	public String nome;
	public String nomeCurso;
	public String matricula;
	public Object notasDisciplinas;
	public int nota;
	

	
}

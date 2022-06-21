package java_Poo;

import java.util.Scanner;

import arrays.Aluno;

/* Escreva uma classe para representar um Aluno. Adicione atributos
 * relacionados ás caracteristicas de um Aluno,como nome,matrícula,curso
 * que está matriculado,nome de 3 disciplinas que está cursando e as notas
 * dessas 3 disciplinas.Desenolva um método para verificar se o aluno está
 * aprovado(nota maior ou igual a 7)em uma determinada disciplina.
 * Escreva um programa para testar essa classe, que pede as informações do
 * aluno ao ususario e ao final informa o nome das disciplinmas,mostra as
 * notas e mostra se o aluno foi aprovado ou não.
 */
public class Exerc03 {
 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno;");
		aluno.nome = scan.next();
		
		System.out.println("Entre com o nome do curso;");
		aluno.nomeCurso = scan.next();
		
		System.out.println("Entre com a matricula;");
		aluno.matricula = scan.next();
		
		//aluno.nomeDisciplinas = new String[3];
		for (int i=0; i<aluno.nomeDisciplinas.length(); i++) {
			System.out.println("Entre com o nome da dsiciplina" + aluno.nomeDisciplinas.length());
		  for(int j = 0; j<aluno.notasDisciplinas[i].length; j++) {
			  System.out.println("Entre com a nota "+ (j+1));
			  System.out.println(notasDisciplinas[i][j] +" ");
			 
		  }
		  System.out.println();
		}
	}
	boolean verificarAprovado(int indice) {
		
		double soma = 0;
		
		for(int i=0; i<notasDisciplinas[indice].length; i++) {
			soma += notasDisciplinas[indice] [i];
		}
		double media = soma /4;
		if(soma >= 7 ) {
			return true;
		} else {
			return false;
		}
	}
}

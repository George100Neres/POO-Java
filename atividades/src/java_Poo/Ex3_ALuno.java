package java_Poo;
/* Escreva uma classe para representar um Aluno. Adicione atributos
 * relacionados ás caracteristicas de um Aluno,como nome,matrícula,curso
 * que está matriculado,nome de 3 disciplinas que está cursando e as notas
 * dessas 3 disciplinas.Desenolva um método para verificar se o aluno está
 * aprovado(nota maior ou igual a 7)em uma determinada disciplina.
 * Escreva um programa para testar essa classe, que pede as informações do
 * aluno ao ususario e ao final informa o nome das disciplinmas,mostra as
 * notas e mostra se o aluno foi aprovado ou não.
 */

public class Ex3_ALuno {

	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas = new String[3];
										// nome disciplinas, notas disciplinas 
	double[][] notasDisciplinas = new double[3][4];
	
	void mostrarInfo() {
		System.out.println("Nome :" + nome);
		System.out.println("Matricula :" + matricula);
		System.out.println("Nome do curso :" + nomeCurso);
		
		 for(int i = 0; i<aluno.notasDisciplinas[i].length; i++) {
			System.out.println("Notas da disciplina" + nomeDisciplinas[i]);
			for (int j=0; j<notasDisciplinas[i].length; j++)
			  System.out.println("Entre com a nota" + (j+1));
			  aluno.notasDisciplinas[i][j] = scan.nextDouble();
			 
		  }
		 aluno.mostrarInfo();
		 
		 for(int i=0; i<aluno.nomeDisciplinas.length; i++) {
			 if (aluno.verificarAprovado(i)) {
				 System.out.println("Disciplina") + aluno.nomeDisciplinas[i] + " " + "foi Aprovado");
				 
			 } else {
				 System.out.println("Disciplina") + aluno.nomeDisciplinas[i] + " " + "foi Reprovado");
			 }
		 }
	}
 }


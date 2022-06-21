package oo.composicao;

public class CursoTeste {
  
	public static void main(String[] args) {
		
	   Aluno aluno1 = new Aluno("Joao");
	   Aluno aluno2= new Aluno("Maria");
	   Aluno aluno3 = new Aluno("Pedro");
	   
	   Curso curso1 = new Curso("Java Completo");
	   Curso curso2 = new Curso("Web 2026");
	   Curso curso3 = new Curso("Kotlin");
	   
	   curso1.adicionarAluno(aluno1);
	   curso1.adicionarAluno(aluno2);
	   
	   curso2.adicionarAluno(aluno1);
	   curso2.adicionarAluno(aluno3);
	   
	   aluno1.adicionarCurso(curso3);
	   aluno2.adicionarCurso(curso3);
	   aluno3.adicionarCurso(curso3);
	   
	   //Fara uma varredura no array de alunos do curso1
	   for(Aluno aluno: curso1.alunos) {
		   System.out.println("Estou matriculado no curso 1..." + curso1.nome);;
		   System.out.println("E o meu nome é "+ aluno.nome);
		   System.out.println();
	   }
	   
	   System.out.println(aluno1.cursos.get(0).alunos);
	   
	   
	}
}

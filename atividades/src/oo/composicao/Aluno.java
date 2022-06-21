package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	// Lista COnstante que foi instanciada na memoria
    final String nome;
	List<Curso> cursos = new ArrayList<>();
	
   Aluno(String nome) {
	   this.nome = nome;
	   this.cursos = new ArrayList<Curso>();
   }
   
   void adicionarCurso(Curso curso) {
	   this.cursos.add(curso);
	   curso.alunos.add(this);
   }
   
   // Vai retornar o Curso através do nome do ALuno
   Curso obterCursoPorNome(String nome) {
	   for(Curso curso: this.cursos) {
		  if(curso.nome.equalsIgnoreCase(nome)) {
			  return curso;
		  }
	   }
	   
	   return null;
	   
   }
   
    public String toString() {
	   return nome;
   }
}

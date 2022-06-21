package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	 String nome;
	 // O aluno vai ter uma lista de alunos.
	 List<Aluno> alunos = new ArrayList<>();
	 
	 public Curso(String string) {
		// TODO Auto-generated constructor stub
	}

	void adicionarAluno(Aluno aluno) {
		 this.alunos.add(aluno);
		 aluno.cursos.add(this);
		 
	 }
}

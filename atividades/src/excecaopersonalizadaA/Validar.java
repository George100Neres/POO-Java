package excecaopersonalizadaA;

import arrays.Aluno;

public class Validar {

	private Validar() {}
	
	public static void aluno(excecaopersonalizadaA.Aluno aluno) {
		// Exceçao
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		// Exceçao
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			  throw new NumeroForaIntervaloException("nota");
		}
	}
}

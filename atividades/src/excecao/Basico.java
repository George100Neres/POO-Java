package excecao;

import arrays.Aluno;

public class Basico {
 
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		// Vai tratar o erro no recho de codigo, try catch
		try {
			imprimirNomeDoAluno(a1);
		} catch(Exception excecao) {
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario");
		}
		// Tratar outro erro,aritmetica
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu o erro: "+ e.getMessage());
		}
		
	
	 
	 System.out.println("Fim :)");
		
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}


package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
  
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Carlos", 8.6);
		Aluno a2 = new Aluno("Ana", 3.9);
		Aluno a3 = new Aluno("Gui", 6.5);
		Aluno a4 = new Aluno("Fai", 4.6);
		Aluno a5 = new Aluno("Sid", 2.6);
		Aluno a6 = new Aluno("Mathus", 8.7);
		Aluno a7 = new Aluno("Caio", 5.3);
		
		List<Aluno> alunos= Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		alunos.stream()
		     .filter(a -> a.nota >= 7)
		     .map(a -> "Parabens" + a.nome + "! Voce foi aprovado(a)");
			 .forEach(System.out::println);
	}
}

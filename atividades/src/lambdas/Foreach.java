package lambdas;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class Foreach {
  
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia","Gui","Lia" );
		// Ira percorrer o nome dos aprovados.
		
		System.out.println("Forma tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("/n LambdaV#01");
		// Pra cada elemento dessa lista, execute cada elemento dessa Lambda.
		aprovados.forEach(nome ->  System.out.println(nome + "!!!" ));
		
		
		System.out.println("/nReference Method");
		aprovados.forEach(System.out::println);System.out.println("/n LambdaV#02");
		
		aprovados.forEach((nome) -> { System.out.println(nome + "!!!" ); });
		
		System.out.println("/n LambdaV#02");
		// Pra cada elemento dessa lista, execute cada elemento dessa Lambda.
		aprovados.forEach(nome ->  System.out.println(nome + "!!!" ));
		
	}

	static void meuImprimir(String nome) {
		System.out.println("Oi!Meu nome é "+ nome);
	}
}

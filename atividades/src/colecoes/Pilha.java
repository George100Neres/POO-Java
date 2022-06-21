package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		// Vai adicionar o ulitmo elemento
		
		livros.add("O Pequeno Principe");
		livros.push("Don Quixote");
		livros.push("O Hobbite");
		
		System.out.println(livros.peek());
		
		
	}
}

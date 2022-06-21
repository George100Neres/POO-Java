package java_Poo;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
  
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia
		// quando a fila está cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o proximo elementos
		// da fila (sem remover)
		
		// Diferença é o comportamento ocorre
		// quando a fila está vaiza
		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção
		System.out.println(fila.element());
		
		// a cada vez que e chamado pool,ele vai removendo o elemento da fila.
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}

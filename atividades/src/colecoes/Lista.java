package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);		
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Matheus"));
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Carol"));
		
		System.out.println(lista.get(3)); // Acessar pelo índice
		
		
		lista.remove(1); // Ele ira remover o Objeto do indice 1
		
		// Ira imprimir na ordem de Inserção
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}

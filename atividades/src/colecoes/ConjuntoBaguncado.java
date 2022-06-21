package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		// Nao ler numeros Nomesda lista
		Set<String> listaAprovados = new HashSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Bianca");
		listaAprovados.add("Ana");
		
		
		for(String candidato: listaAprovados) {
			 System.out.println(candidato);
		}
		// Nao ler numeros repetidos da lista
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(2);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}

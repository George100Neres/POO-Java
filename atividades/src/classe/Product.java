package classe;

import java.util.Scanner;

public class Product {
  

 // Essas variaveis pertecem ao Objeto.
	public String nome;
	public double preco;
	static double desconto = 0.25;
	
	void Product() {
		
	}
	// Construtor 
	Product(String nomeInicial, double precoInicial, double precodescontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = precodescontoInicial;
		
	}
	
	
	double precoComDesconto() {
		return preco * (1  - desconto);
	}
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}

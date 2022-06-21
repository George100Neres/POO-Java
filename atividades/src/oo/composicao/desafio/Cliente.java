package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;
	// CLiente tem relação ocm Compra
public class Cliente {
	final String nome;
	List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
		
	}
	double obterValorTotal() {
		double total = 0;
		
		// Varrer o tvalor total das compras.
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
   }

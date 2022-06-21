package oo.composicao.desafio;

public class Item {
   // Item tem relação com Produto.
	final Produto produto;
	final int quantidade;
	
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
}

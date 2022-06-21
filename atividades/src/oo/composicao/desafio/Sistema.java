package oo.composicao.desafio;

public class Sistema {
 
	 // Sistema sera o metodo principal
	public static void main(String[] args) {
		
	
	Compra compra1 = new Compra(); // preco, quantidadeProduto
	compra1.adicionarItem("Caneta", 9.67, 100);
	compra1.adicionarItem(new Produto("Notebook", 9.67), 13);
	
	Compra compra2 = new Compra(); // preco, quantidadeProduto
	compra2.adicionarItem("Caderno", 12, 5);
	compra2.adicionarItem(new Produto("Lapis", 2.50), 20);
	
	Cliente cliente = new Cliente("Maria Julia Moraes:");
	cliente.adicionarCompra(compra1);
	cliente.compras.add(compra2);
	
	// Valor total Dos itens somados
	System.out.println(cliente.obterValorTotal());
	
	}
}

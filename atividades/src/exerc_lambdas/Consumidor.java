package exerc_lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
   
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1  = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(p1);
		
		Produto p2  = new Produto("Notebook", 2.500, 0.30);
		Produto p3  = new Produto("Caderno", 43.65, 0.10);
		Produto p4  = new Produto("Borracha", 3.65, 0.2);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4);
		
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
		
	}
}

package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class COnsumidor {
  
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.56, 0.042);

		imprimir.accept(p1);
		
		Produto p2 = new Produto("Notebook", 2974, 0.26);
	     Produto p3 = new Produto("Lapis", 3.56, 0.5);
	     Produto p4 = new Produto("Caderno", 29.85, 0.20);  
	     
	    List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
	    
	    produtos.forEach(imprimir);
	    produtos.forEach(p -> System.out.println(p.preco));
	    produtos.forEach(System.out::println);
	}
}

package classe;

public class ProductTest {
  
	public static void main(String[] args) {
		
	
		Product p1 = new Product("Notebook", 4356.89, 0);
		//p1.nome = "Notebook";
	
		
		var p2 = new Product("Lapiseira", 1.65, 3);
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		// 50% do abatimento do PRoduto
		Product.desconto = 0.50;
		
		System.out.println(p1.nome + " "+ p1.precoComDesconto());
		System.out.println(p2.nome + " "+ p1.precoComDesconto());
		
		
		double precoFInal1 = p1.precoComDesconto(0);
		double precoFInal2 = p2.precoComDesconto(0.1); // desconto 10%
		double mediaCarrinho = (precoFInal1 + precoFInal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
		
		
	  System.out.println();
	}
}

package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
  
	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3215.96, 0.15);
		
		/*
		 * 1-A partir do produto calcular o preço real (com desconto)
		 * 2- Imposto Municipal: >= 2500 (8,5%) < 2500 (Isento)
		 * 3- Frete: >= 3000 (100) / < 3000 (50)
		 * 4- Arredondar: Deixar duas casas decimais
		 * 5- Formatar: R$1234,56
		 */
		
	  Function<Produto, Double> precoFinal;
	  UnaryOperator<Double> impostoMunicipal;
	  UnaryOperator<Double> frete;
	  UnaryOperator<Double> arredondar;
	  Function<Double, String> formatar;
	  
	  String preco = precoFinal
			  .andThen(impostoMunicipal)
			  .andThen(frete)
			  .andThen(arredondar)
			  .andThen(formatar)
			  .apply(p);
	  
	}
}

package oo.composicaopolimorfismo;

public class Jantar {
  
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.2); // 200 gramas
		Feijao ingrediente2 = new Feijao(0.1); // 100 gramas
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		// comer osbremesa
		convidado.comer(sobremesa);
		// Resultado do peso
		System.out.println(convidado.getPeso());
		
	}
}

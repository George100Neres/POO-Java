package construtor;

public class Carro {
	
		String marca; 
		String modelo;
		int numPassageiros;
		double capCombustivel;
		double consumoCombustivel;
		
		
		Carro(){
			System.out.println("Classe Carro foi instanciada");
			numPassageiros = 4;
		}
		
		// Construtor
		// Parametros do COnstrutor acima
	public	Carro(String marca, String modelo, int numPassageiros){
			super();
			marca = marca;
			modelo = modelo;
			numPassageiros = numPassageiros;
			capCombustivel = capCombustivel;
			consumoCombustivel = consumoCombustivel;
			System.out.println("Chamando o construtor com 3 parametros");
		}
		
	 public	Carro(String marca, String modelo) {
			this("Fiat", "Ducato", 10);
			System.out.println("Chamando o construtor com 2 parametros");
		}
		
		void exibirAutonomia() {
			System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
							
		}
		
		double obterAutonomia() {
			System.out.println("Método obterAUtonomia foi chamado.");
			
			return capCombustivel * consumoCombustivel;
		}
		
		private Carro divideKMPorConsumoCombustivel() {
			return this;
		}
	public double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
	
	
}

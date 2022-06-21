package java_Poo;

public class TestCarro {

	public static void main(String[] args) {
		
		//atributos do carro
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capComsbustivel = 1;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		
	}
}

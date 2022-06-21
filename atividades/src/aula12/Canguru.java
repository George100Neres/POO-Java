package aula12;

public class Canguru extends Mamifero{
 // ao inves de correr,ira saltar
	@Override
	public void locomover() {
		System.out.println("Saltando");
	}
	
	public void usarBolsa() {
		System.out.println("U&sando Bolsa");
	}
	
	
}

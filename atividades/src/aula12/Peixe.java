package aula12;

public class Peixe extends Animal{
  // Metodos de peixe
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Substancias");
		
	}

	@Override
	public void emitirsom() {
		System.out.println("Peixe que não faz som");
		
	}
	public void soltarBolha() {
		System.out.println("Soltando Bolhas");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}

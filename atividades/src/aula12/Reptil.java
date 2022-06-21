package aula12;

public class Reptil extends Animal{
	//Metodos de Reptil
   private String corEscama;
	@Override
	public void locomover() {
		System.out.println("Rastejando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");
		
	}

	@Override
	public void emitirsom() {
		System.out.println("Som de reptil");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}

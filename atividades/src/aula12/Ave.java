package aula12;

public class Ave extends Animal{
  
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("Voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Frutas");
		
	}

	@Override
	public void emitirsom() {
		System.out.println("Som de Ave");
		
	}

	public String getCorPena() {
		return corPena;
	}
	
	public void fazerninho() {
		System.out.println("Construindo Ninho:");
	}
	
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	
}

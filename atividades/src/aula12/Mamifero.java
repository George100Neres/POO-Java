package aula12;

public class Mamifero extends Animal{
	private String corEscama;
	@Override
	public void locomover() {
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirsom() {
		System.out.println("Som de Mamifero");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	public void setCorPelo(String string) {
		// TODO Auto-generated method stub
		
	}

	public void alimetar() {
		// TODO Auto-generated method stub
		
	}

	
   
	
}

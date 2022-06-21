package oo.abstrato;

public abstract class Mamifero extends Animal{
  
	 // Sobrescrever o metodo mover.
	public abstract String mamar();
		
	@Override
	public final String mover() {
		return "Saindo do lugar";
	}
	
}

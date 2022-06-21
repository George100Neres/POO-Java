package interfac;

public class Quadrado {
 //Atributo 
	
	private int lado;
	
	//Construtor 
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	// Metodo Especifico
	  public double gerarArea() {
		  return lado * lado;
	  }
	// Getters e setters
	public int getLado() {
		return lado;
	}



	public void setLado(int lado) {
		this.lado = lado;
	}
	
	
	
	
}

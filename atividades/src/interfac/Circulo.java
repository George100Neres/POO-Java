package interfac;

public class Circulo {
    // Atributos
	private int raio;
	
	// COnstrutor
	public Circulo(int raio) {
		this.raio = raio;
	}
	
	// Atributos
	
	// Métodos especificos da classe 
       public double calcularArea() {
    	   double area = Math.PI * Math.pow(raio, 2);
		return area;
		   
       }
	//Métodos getters e setters
	public int getRaio() {
		return raio;
	};
	
	public void setRaio(int raio) {
		this.raio = raio;
	}
}

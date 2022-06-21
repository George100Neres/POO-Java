package interfac;

public class App {
 
	public static void main(String[] args) throws Exception {
		//Encapsulamento  -> Interface
	    Circulo circuloPequeno = new Circulo(2);
	   double area = circuloPequeno.calcularArea(); 
	   
	   Quadrado quadrado = new Quadrado(5);
	   System.out.println(quadrado.gerarArea());
	}
}

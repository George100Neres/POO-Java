package interfacinterface_polimf_exerc;

import interfacinterface_polimf_exerc.Figura2D;

public class Circulo extends Figura2D{

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
      return raio * raio * 3.14;			// valor pi ao quadrado
	
	}
	
	
}

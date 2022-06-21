package oo.composicao;

public class Carro {

	Motor motor;
	
	Carro() {
		this.motor = new Motor(this);
	}
	// sera incrementado
	void acelerar() {
		motor.fatorInjecao += 0.4;
	}
	// sera decrementado
	void frear() {
		motor.fatorInjecao -= 0.4;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}

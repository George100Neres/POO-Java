package oo.composicao;

public class Motor {
    
	boolean ligado = false;
	double fatorInjecao = 1;
	private Carro carro;
	
	// COnstrutor do Carro
	Motor(Carro carro) {
		this.carro = carro;
	}
	
	int giros() {
		if(!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}

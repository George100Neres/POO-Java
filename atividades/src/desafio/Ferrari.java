package desafio;

public class Ferrari extends Carro implements Esportivo{

	public Ferrari() {
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		int delta = 15;
	}
	// Se o delta ligar o Trubo,delta vai ser 35
	@Override
	public void ligarTurbo() {
	  int  delta = 35;
		
	}

	// Se desligar o  turbo,ddelta vai ser 15
	@Override
	public void desligarTurbo() {
		int  delta = 15;
		
	}
	
	
}

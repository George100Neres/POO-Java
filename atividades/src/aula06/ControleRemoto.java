package aula06;

public class ControleRemoto implements Controlador {
  
 // Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	// Metodos Especiais
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
		
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	 // Metodos abstratos
	
	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("Esta ligado? " + this.getLigado());
		System.out.println("Esta ltocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=10) {
			   System.out.println("[]");
		}
	}

	@Override
	public void fecharMenu() {
	   System.out.println("Fechando Meunu");
		
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		// se tiver ligado e nao tiver tocando
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		// se tiver ligado e tiver tocando
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}
	
	
}

package oo.abstrato;

public class Cachorro extends Animal{

	@Override
	public String mover() {
		return "Usando as patas";
	}
	
    @Override
    public String mamar() {
    	return "usando leite";
    }
}

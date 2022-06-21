package game;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10; // norte
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11; // norte
		
		/*
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		*/
		System.out.println("Monstro tem =>" + monstro.vida);
		System.out.println("Heroi tem =>" +heroi.vida);
		
		monstro.atacar(heroi); // jogador1 atacar jogador 2
		heroi.atacar(monstro);
		
		monstro.atacar(heroi); 
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi); 
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem =>" + monstro.vida);
		System.out.println("Heroi tem =>" +heroi.vida);
	}
}

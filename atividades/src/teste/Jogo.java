package teste;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		// Vai andar 4 Vezes na Direção do Norte.
	
		 // Axibe a vida inicial
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
		//jogadort 1 ataca o 2 
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		// Sai do range de Ataque do heroi
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem =>" + monstro.vida);
		System.out.println("Heroi tem =>"+ heroi.vida);
	}
}

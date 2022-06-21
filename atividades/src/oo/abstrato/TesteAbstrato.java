package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {
		Animal a = new Cachorro();
		System.out.println(a.mover()); // executar a chamada do método mover.
		System.out.println(a.mamar());
		System.out.println(a.respirar());
	}
}

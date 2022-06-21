package aula05;

public class Aula05 {
  
	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		
		ContaBanco p2= new ContaBanco();
		p1.setNumConta(22222);
		//p1.setDono("Creuza");
		p1.abrirConta("CP");
		
		p1.depositar(140);
		p2.depositar(500);
		
		p1.estadoAtual();
		p2.estadoAtual();
		
		}
}

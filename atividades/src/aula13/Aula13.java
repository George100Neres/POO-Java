package aula13;

public class Aula13 {
  public static void main(String[] args) {
	  // Programa Principal
	Cachorro c = new Cachorro();
	
	c.reagir(11,45);
	c.reagir(19,00);
	
	c.reagir(true); // quem e dono,vai abanar
	c.reagir(false); // quem nao for dono,vai latir
    }
}

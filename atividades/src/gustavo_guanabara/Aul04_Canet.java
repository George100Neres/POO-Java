package gustavo_guanabara;

public class Aul04_Canet {
  
	public static void main(String[] args) {
		// Objeto caneta
	   Caneta c1 = new Caneta();
	   c1.cor = "Azul";
	   c1.ponta = 0.5f;
	  // c1.destampar(); // se tiver destampada,eu posso rabiscar.
	   c1.tampar();
	   c1.status();
	   c1.rabiscar();
	   
	   Caneta c2 = new Caneta();
	   c2.modelo = "Hostnet";
	   c2.cor = "Preta";
	   c2.destampar();
	   c2.rabiscar();
	   //Caneta c2 = new Caneta("KKK", "Laranja", 1.5f);
	   //c2.status();
	   
	}
}

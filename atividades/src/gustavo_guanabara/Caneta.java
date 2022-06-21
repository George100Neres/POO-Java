package gustavo_guanabara;

public class Caneta {
  // Atributos
	public String modelo;
	public String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	// Metodo COnstrutor 
	
	
	public void status() {
         System.out.println("Modelo:" + this.modelo);
         System.out.println("Uma caneta" + this.cor);
         System.out.println("Pomta:" + this.ponta);
         System.out.println("Carga:" + this.carga);
         System.out.println("Esta tampada?:" + this.tampada);
	}
	// Nao pode Rabiscar,se tiver tampada
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO: Não posso rabiscar");
		} else {
			System.out.println("Estou rabiscando");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
}

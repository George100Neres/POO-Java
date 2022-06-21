package aula11;
 // Subclasse de Aluno
public class Bolsista extends Aluno{
  
	private float bolsa;
	
	public void renoverBolsa() {
		System.out.println("Renovando bolsa de" + this.nome);
	}
	
	public void pagarMensalidade() {
		System.out.println(this.nome + "é bolsista! Pagamento facilitado");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
}

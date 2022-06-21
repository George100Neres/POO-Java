package conta_corrent;

public class Corrent_Test {

	public static void main(String[] args) {
		
	
	 ContaCorrente conta = new ContaCorrente();
	 conta.numero = "123456";
	 conta.agencia = "1234";
	 conta.especial = true;
	 conta.limiteEspecial = 500;
	 conta.valorEspecialUsado = 0;
	 conta.saldo = -10;
	 
	 boolean SaqueEfetuado = conta.realizarSaque(30);
	 
	 
	 if(SaqueEfetuado) {
		 System.out.println("Saque efetuado com sucesso");
		 System.out.println("Saldo atual da conta" + conta.saldo);
	 } else {
		 System.out.println("Não foi possivel realizar saque, saldo insuficiente");
	 }
	
  }
}
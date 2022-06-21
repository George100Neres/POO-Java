package java_Poo;
/* Criar uma classe para representar uma conta corrente que possui um número,
 * um saldo,um status que informa se ela é especial ou não,um limite.
 * Desenvolva métodos para realizar saque(verificando se o cliente
 * está usando cheque especial ou não.Desenvolva um programa para
 * testar essa classe. 
 */

public class Exerc_2_Conta {

	public static void main(String[] args) {
		
	
	ContaCorrente conta = new ContaCorrente();
	conta.numero = "123456";
	conta.agencia = "1234";
	conta.especial = true;
	conta.limiteEspecial = 500;
	conta.saldo = -10;
	
	System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
	
	// realizou o Saque da conta
	boolean saqueEfetuado = conta.realizarSaque(10);
	
	
	if (saqueEfetuado) {
		 System.out.println("Saque efeutado com sucesso.");
		 conta.consultarSaldo();
	    } else {
	    	 System.out.println("Nao foi possivel realizar o saque. Salado insuficiete");
	    } 
	  // Saque mais 500 Reais
	saqueEfetuado = conta.realizarSaque(500);
	
	System.out.println("Tentativa de Saque de R$500 reais");
	if (saqueEfetuado) {
		 System.out.println("Saque efeutado com sucesso.");
		 conta.consultarSaldo();
	    } else {
	    	 System.out.println("Nao foi possivel realizar o saque. Salado insuficiete");
	    } 
	 System.out.println("Deposito de R$500,00 reais");
	 conta.depositar(500);
	 conta.consultarSaldo();
	 conta.consultarSaldo();
	 
	 if (conta.verificarUsoChequeEspecial()) {
		 System.out.println("Esta Usando Cheque Especial");
	 } else {
		 System.out.println("Não Esta Usando Cheque Especial");
	 }
	 
	 conta.realizarSaque(600);
	 conta.consultarSaldo();
	 if (conta.verificarUsoChequeEspecial()) {
		 System.out.println("Esta Usando Cheque Especial");
	 } else {
		 System.out.println("Não Esta Usando Cheque Especial");
	 }
	 
	 
	}
}

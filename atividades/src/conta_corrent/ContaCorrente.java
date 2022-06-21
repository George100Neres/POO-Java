package conta_corrent;

/* Criar programa para representar uma conta corrente que possua um numero,
 * um saldo, um sutatus que informa se ela é especial ou não,um 
 * limite.Desenvovla métodos para realizar saque(verificando se o cliente pode realizar
 * saques), depositar dinheiro, consultar saldo e verificar se o 
 * cliente está usando cheque especial ou não.Desenvolva um programa
 * para testar essa classe.
 */
public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	
	boolean realizarSaque(double quantiaASacar) {

		// se o saldo for maior ou igual a quantiasacada, entao sera realizado o saque do valor
		if(saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else {
			// verifica se o limite especial tem saldo
			if (especial) {
				
				double limite = limiteEspecial - saldo;
				if(limite >= quantiaASacar) {
					saldo -= quantiaASacar;
				}
			} else {
				return false; // nao e especial e nao tem saldo suficiente
			}
		}
		return especial;
	}
}

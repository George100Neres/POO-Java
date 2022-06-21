package java_Poo;

public class ContaCorrente {

String numero;
String agencia;
boolean especial;
int limiteEspecial;
double valorEspecialUsado;
int saldo;

	
	
	boolean realizarSaque(double quantiaASacar) {
		// Se o Saldo for Maior que 0 ele tem saldo na conta
		if(saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else { // nao tem saldo na conta
			if(especial) {
				// verificar se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if(limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false; // nao e especial e nao tem saldo suficiente
			}
		}
		
	}
	// metodo depositar dinheiro
	void depositar(double valorDepositado) {
		
		
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da conta" + saldo);
	}
	
	// Verificar se o cliente esta usado o ChequeEspecial
	boolean verificarUsoChequeEspecial() {
		// se saldo for maior que 0,ele nao ususara cheque,se nao,ele usara
		return saldo < 0;
	}
}


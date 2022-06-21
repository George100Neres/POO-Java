package aula05;

public class ContaBanco {
  
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//MEtodos Personalizados
	
	public void estadoAtual() {
		System.out.println("C--------------------------");
		System.out.println("COnta:" + this.getNumConta());
		System.out.println("CTipo:" + this.getTipo());
		System.out.println("Dono:" + this.getDono());
		System.out.println("Saldo:" + this.getSaldo());
		System.out.println("Status" + this.getStatus());
	}
	
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(t == "CC") {
			this.saldo = 50;
			this.setSaldo(50);
		} else if (t == "CP"){
			this.saldo = 150;
		} else {
			this.setStatus(false);
			System.out.println("COnta fechada com Sucesso:");
		}
	}
	
	   // Se tiver ativo,recebo o depositop
	public void depositar(float v) {
		if (this.getStatus()) {
			this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado com sucesso na conta " + this.getDono());
		} else {
			System.out.println("Impossivel depositar em uma conta fechada");
		}
	}
	
	public void sacar(float v) {
		if(this.getStatus()) {
			if(this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de" + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para saque");
			}
		} else {
			System.out.println("Impossivel sacar de uma conta fechada!");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
		} else {
			System.out.println("Impossivel pagar uma conta fechada:");
		}
		
	}
	private String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean getStatus() {
		// TODO Auto-generated method stub
		return false;
	}


	private void setSaldo(float f) {
		// TODO Auto-generated method stub
		
	}

	private void setStatus(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private void setTipo(String t) {
		// TODO Auto-generated method stub
		
	}

	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
		} else if(this.getSaldo() < 0) {
			System.out.println("Conta nao pode ser fechada pois tem debito");
		}
	}
	
	private int getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void depositar() {
		
	}
	
	public void sacar() {
		
	}
	
	
	
	// Metodos especias
	
	public ContaBanco() {
		this.saldo= 0;
		
	}
	
	public void setNumConta(int n) {
		this.numConta = n;
		this.status= false;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public String getDono() {
		return this.dono;
	}





	
}

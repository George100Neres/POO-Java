package exceptions52;

public class Agenda {
  
	private Contato[] contatos;
	
	// Construtor de contatos // tera a capacidade de armazenar 5 contatos.
	public Agenda() {
		contatos = new Contato[5];
	}
	
	public void adicionarContato(Contato c) throws AgendaCheiaException {
	
		boolean cheia = true;
	   for(int i=0; i<contatos.length; i++) {
		   if (contatos[i] != null) {
			   contatos[i] = c;
			   cheia = false;
		   }
	   }
		// se tiver cheia, vai lançar uma exceção
	   if(cheia) {
		throw new AgendaCheiaException(); 
	   }
	}
	
	
	   // Consultar o contato através de nome.
	   public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException{
	
		   for(int i=0; i<contatos.length; i++) {
			   if (contatos[i] != null) {
				  if(contatos[i].getNome().equalsIgnoreCase(nome)) {
				  return i;
			   }
		   }
	}
	   throw new ContatoNaoExisteException(nome);
	// Caso nao exista,sera lançada uma exception

	 }


	@Override
	public String toString() {
		String s = "";
		for (Contato c: contatos) {
			s += c.toString() + "\n";
		}
		return s;
	}
}

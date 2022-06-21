package exceptions52;

/*Escreva uma classe COntato que cotenha nome, telefone e um identificador
 * .Esse identificador deve ser gerado automaticamente pela classe através
 * de um contador[cada vez que um Contato é cirado o contador é incrementado e atrbuido
 * ao identificador].Cire uma classe Agenda que irá funcionar para gerenciar os Contatos.
 * Essa classe precisa de ter um método para adicionar um COntato e também para consultar.
 * Cire uma classe Teste que informe um menu ao usuário:1 - para consultar um contato
 * 2 - para adicionar um contato na agenda.
 * 
 * Se o contato não existir,o programa deve lançar uma exceção de 
 * ContatoNaoExisteException.Caso a agenda esteja cheia quando o usuário
 * quier adicionar um novo contato,o programa deve lançar uma exceção
 * AgendaCheiaException.Trate também as exceções de tipo de dados
 * (caso o usuário entre com um tipo de dado inválido.)
 * 
 * 
 * 
 */


public class Contato {
  
	private static int contador = 0;
	
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	
	public Contato() {
		contador++;
		id=contador;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		String s  = "[";
		s += "Id: " + id;
		s += " Nome: " + nome;
		s += " Telefone: " + telefone;
		s += " Email: " + email;
		s += "]"; 
		return s;
	}
	
	
}

package fundaments;

public class Usuario {

	public String nome;
	public String email;

	 public boolean equals(Object objeto) {
		 
		 Usuario outro = (Usuario) objeto;
		 
		 boolean nomeIgual = outro.nome.equals(this.nome);
		 boolean emailIgual = outro.email.equals(this.email);
	 }
}

package excecaopersonalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends Runtime{
 
	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está negativo", nomeDoAtributo);
		 		
	}
}

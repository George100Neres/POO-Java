package fundaments;

public class TIpoString {
  
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2)); // Ler a posição do caractere.
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa")); // Verifica a 1 String se for maiuscula e true.
		System.out.println(s.toLowerCase("boa");// Verifica se a String Digitada  e minuscula 
		System.out.println(s.toUpperCase().endsWith("TARDE")); // Faz a verificação da Ultima String se ela é Maiuscula.
		System.out.println(s.length()); // Diz quantas Strings tem aquela variavel.
		System.out.println(s.toLowerCase().equals("boa tarde"));// Verifica se todas as strings são minusculas.
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Ignora a COmparação de Strings entre Maiusculas e minusculas.
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.78;
		
		System.out.println("Nome"+nome +"\nSorbenome :"+sobrenome +"\nIdade: "+ idade + "\nSalario: "+ salario);
		
		String frase = String.format("Nome"+nome +"\nSorbenome :"+sobrenome +"\nIdade: "+ idade + "\nSalario: "+ salario);
		System.out.println(frase); // Vai imprimir a a frase na varaivel frase.
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		
		
	}
}

package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
    // Valores (Interio e String)
	 Map<Integer, String> usuarios = new HashMap<Integer, String>();
	 
	 usuarios.put(1,  "Roberto");
	 usuarios.put(2,  "Ricardo");
	 usuarios.put(3,  "Rafaela");
	 usuarios.put(4,  "Rebeca");
	 
	 // vai imprimir a quantidade de valores
	 System.out.println(usuarios.size());
	 //retorna valores da chave
	 System.out.println(usuarios.keySet());
	 // retorna os nomes e os valroes da chave
	 System.out.println(usuarios.entrySet());
	 // verifica se tem o valor daqula chave,se tiver , ira imprimir
	 
	 System.out.println(usuarios.containsKey(2));
	 // Verifica se tem a String que foi declara,se tiver,retorna verdadeiro
	 //se nao tiver,retorna falso.
	 System.out.println(usuarios.containsValue("Rebeca"));
	 
	 // ira percorrer todos os valores da chave,depois ira imprimir
	 for(int chave: usuarios.keySet()) {
		 System.out.println(chave);
	 }
	 // Ira retornar todos os nomes
	 for(String valor: usuarios.values()) {
		 System.out.println(valor);
	 }
	 
	 for(Entry<Integer, String> registro: usuarios.entrySet()) {
		 System.out.println(registro.getKey() + " ===> ");
		 System.out.println(registro.getValue());
	 }
	}
}

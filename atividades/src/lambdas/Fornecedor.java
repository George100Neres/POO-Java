package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
  
	public static void main(String[] args) {
		
		// Ira percorrer a Lista Inteira
		Supplier<List<String>> umLista = 
				() -> Arrays.asList("Luana", "Ana", "Carol");
		
				System.out.println(umLista.get());
				
	}
}

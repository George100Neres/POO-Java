package Switch;

public class Continue {
  
	public static void main(String[] args) {
		
		for (int i=0; i < 10; i++) {
			if(i %2 == 1) {
				continue;  // Se o numero divisiel for numeor impar,ira continuar
			}
			System.out.println(i); // Ira mostrar o resultado dos nuemros pares
		}
	}
}

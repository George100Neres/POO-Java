package exceptions47;

public class Exceptions {
  
	 public static void main(String[] args) {
		
		 // tratativa de erro  
		 try {
			 int[] vetor = new int[4];
			 
				System.out.println("Antes da exception"); 
				
				
				vetor[4] = 1; // varaivel nao existe nessa posicao.
				
				System.out.println("Esse texto não sera impresso.");
		 } catch(ArrayIndexOutOfBoundsException exception) {
			 System.out.println("Exceção ao acessar um indice do vetor que nao existe ");
		 }
		
		System.out.println("Esse texto será impresso após a exception");
	}
}

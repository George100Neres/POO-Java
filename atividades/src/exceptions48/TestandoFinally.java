package exceptions48;

public class TestandoFinally {

   public static void main(String[] args) {
	
	int[] numeros = {4, 8, 16, 32, 64, 128};
	int[] demon = {2,0,4,8,0};
	
	for(int i=0; i<numeros.length; i++) {
		
	  try {
	 // Erro ao dividir por zero.
			System.out.println(numeros[i] + "/" + demon[i] + "=" + (numeros[i]/demon[i]));
	  }
	  // Capturar a exceção Aritmetica.
	  catch(ArithmeticException e) {
		  System.out.println("Erro ao dividir por zero");
	  }
	  catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("Posiçao do array Invalida");
	  }
	  finally {
		  System.out.println("Essa linha é impressa sempre após o try e o catch");
	   }
   }
  }  
}

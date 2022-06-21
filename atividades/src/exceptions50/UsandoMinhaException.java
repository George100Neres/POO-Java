package exceptions50;

public class UsandoMinhaException {
  
	public static void main(String[] args) {
		
			  // se dividr numeor par pelo impar,vai dar resultado numero quebrado.
			int[] numeros = {4, 8, 16, 32, 64, 128};
			int[] demon = {2,0,4,8,0};
			
			for(int i=0; i<numeros.length; i++) {
			  try {
				  if(numeros[i] % 2 != 0) {
					  //lançar a exception aqui.
				  }
			 // Erro ao dividir por zero.
					System.out.println(numeros[i] + "/" + demon[i] + "=" + (numeros[i]/demon[i]));
			  }
			  // Capturar a exceção Aritmetica.
			  catch(ArithmeticException | ArrayIndexOutBoundsException e) {
				  System.out.println("Aconteceu um erro");
			  }
			}
		}
}

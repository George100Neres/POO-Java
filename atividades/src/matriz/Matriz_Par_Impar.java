package matriz;

import java.util.Scanner;

public class Matriz_Par_Impar {

	 static Scanner scan = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		
	
	 int[][] numeros = new int[3][3];
	 
	 for (int i=0; i<numeros.length; i++) {
		 for (int j=0; j<numeros.length; j++) {
			 
			 System.out.println("Entre com o valor da pos ["+ i +"," + "]");
			 numeros[i][j] = scan.nextInt();
		 }
	 }
	
	int qtdPares = 0;
	int qtdImpares = 0;
	 for (int i=0; i<numeros.length; i++) {
		 for (int j=0; j<numeros.length; j++) {
			 
			 if(numeros[i][j] % 2 == 0) {
				 qtdPares++;
			 }
			 else {
				 qtdImpares++;
			 }
		 }
	 }
	 
	 for (int i=0; i<numeros.length; i++) {
		 for(int j=0; j<numeros.length; j++) {
			 System.out.println(numeros[i][j] + "");
		 }
		 System.out.println();
	 }
	 System.out.println("Pares = "+ qtdPares);
	 System.out.println("Pares = "+ qtdImpares);
	 
   }
}



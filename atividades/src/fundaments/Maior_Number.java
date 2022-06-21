package fundaments;

public class Maior_Number {


	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Entre com o primeiro numero:");
	int num1 = entrada.nextInt();
	
	System.out.println("Entre com o segundo numero:");
	int num2 = entrada.nextInt();
	
	if(num1 > num2) {
		
		System.out.println("O Maior numero e:"+num1);
	  }
	else {
		System.out.println("O maior numero e:"+num2);
	  }
	}
}

package java_Poo;

public class TestReferencia {
  
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.deposita(100);
		
		Conta c2 = c1;
		c2.deposita(200);
		
		System.out.println(saldo);
	}
}

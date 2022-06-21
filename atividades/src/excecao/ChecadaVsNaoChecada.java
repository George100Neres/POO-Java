package excecao;

public class ChecadaVsNaoChecada {
  
	public static void main(String[] args) {
		try {
			geraErro1();
		}catch (Exception e) {
			System.out.println();
		}
		
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Fim :)");
	}
	// Nao checada ou não verificada
	static void geraErro1() {
	  throw	new RuntimeException("Ocorreu um erro bem legal #01:");
		
	}
	
	// Exceçao checada ou verificada
	static void geraErro2() {
		new Exception("Ocorreu um erro bem legal #021");
	}
}

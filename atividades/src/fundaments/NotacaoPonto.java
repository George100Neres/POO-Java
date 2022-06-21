package fundaments;

public class NotacaoPonto {

	 public static void main(String[] args) {
		  
		 String s = "Bom dia X";
		 s = s.replace("X", "Senhora"); // Vai substituir a string X, pela string Senhora.
		 s = s.toUpperCase(); // Transforma as Strings minusculas para Maiusculas. 
		 s = s.concat("!!!"); // Ira concatenar a String
		 
		 System.out.println(s);
		 
		 String x = "Leo".toUpperCase();
		 System.out.println(x);
		 
		 String y = "Bom dia X",replace("X","Gui").toUpperCase().concat("!!!");
		 System.out.println(y);
	  }

	
}

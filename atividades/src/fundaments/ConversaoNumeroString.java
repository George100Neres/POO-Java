package fundaments;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		// De String para Int
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//De Interio para String
		Integer num2 = 10000;
		System.out.println(Integer.toString(num2));
		
		System.out.println((""+ num2).length());
	}

}

package fundaments;

public class ConversaoTIpoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // implicita
		System.out.println(a);
		
		float b = (float) 1.123698785477774528; // explicita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explicita (CAST)
		System.out.println(d);
		
	}
}

package Switch;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 0; i < 15; i++) {
			
			if(i == 10) {
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}
}

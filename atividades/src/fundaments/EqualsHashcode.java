package fundaments;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "george.neres100@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "george.neres100@gmail.com";
		
		System.out.println(u1 == u2); // false
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u1));
	}
}

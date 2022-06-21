package equal_hashcode;

import java.sql.Date;

public class EqualsHascode {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.salva@email.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.salva@email.com.br";
		
		System.out.println(u1 == u2); // fals
		System.out.println(u1.equals(u2));
		//System.out.println(u2.equals(new Date()));
		
		
	}
}

package classe;

public class DateTest {

	public static void main(String[] args) {
		
	
	Dat d1 = new Dat();
	d1.dia = 7;
	d1.mes = 11;
	d1.ano = 2021;
	
	var d2 = new Dat();
	d2.dia = 31;
	d2.mes = 12;
	d2.ano = 2020;
	
	System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
	
	}
}

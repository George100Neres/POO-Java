package classe;

import java_Poo.Data;

public class ValorVsReferencia {
  
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		
		// atribuiçao por valor
		a++;
		b--;
		
		System.out.println(a + " "+ b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1;  //Atribuiçao por Referencia (Objeto).
		
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2024;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
	}
}

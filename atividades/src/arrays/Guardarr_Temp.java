package arrays;

 // Armazenar a temoeratura media por 1 ano.
public class Guardarr_Temp {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 33.3;
		double tempDia004 = 35.7;
		double tempDia005 = 38;
		
		double[] temperaturas = new double[365]; // 365 dias
		temperaturas[0] = 31.5;
		temperaturas[1] = 32;
		temperaturas[2] = 33.9;
		temperaturas[3] = 34;
		temperaturas[4] = 36.8;
		
		System.out.println("O valor da temperatura do dia 1 é" + temperaturas[0]);
		
		for (int i=0; i<temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia"+ (i+1) +"é" + temperaturas[i]);
		}
		
		
	}
}

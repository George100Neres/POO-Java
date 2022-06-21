package matriz;

import java.util.Scanner;

/* /* Fazer um programa que armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24 horas,
 * onde para cada 24 horas podemos associar uma tarefa especifica(compromisso agendado).O programa deve ter um menu onde o usuario deve
 * ter um menu onde o usuario indica o dia do mês que deseja alterar a hora,entrada em seguida com o compromisso, ou então,o usuario
 * pode também consultar a agenda, fornecendo o dia e a hora para obter o  compromissao armazenado. 
 */

public class Agend_Compromis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		int opcao;
		while(!sair) {
			
			System.out.println("Digite 1 para compromissos");
			System.out.println("Digite 2 para verificar compromissos");
			System.out.println("Digite 0 para sair:");
			
			opcao = scan.nextByte();
			
			if (opcao == 1) { // adicionar compromisso
				
				boolean diaValido = false;
				int hora = 0;
				int dia;
				//Enquanto o dia nao for valido
				while(!diaValido) {
					System.out.println("Entre com a hora do compromisso.");
					Scanner entrada;
					dia = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						diaValido = true;
					} else {
						System.out.println("ia invalido, digite novamente!");
					}
					
					dia--;
					System.out.println("Digite o compromisso:");
					compromissos[dia] [hora] = scan.next();
				}
			} else if (opcao == 2) { // verificar compromisso
				boolean diaValido = false;
				int hora = 0;
				int dia = 0;
				//Enquanto o dia nao for valido
				while(!diaValido) {
					System.out.println("Entre com a hora do compromisso.");
					Scanner entrada;
					dia = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						diaValido = true;
					} else {
						System.out.println("ida invalido, digite novamente!");
					}
				}
				
			   dia--;
			} else if(opcao == 0) {
				sair = true;
			} else {
				
				System.out.println("Opção Inválida, Digite novamente.");
				
			}
		}
	}
}

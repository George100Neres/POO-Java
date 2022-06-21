package exceptions52;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {
  
	public static void main(String[] args) {
		
	  Scanner scan = new Scanner(System.in);
	   Agenda agenda = new Agenda();
	  
	 int opcao = obterOpcaoMenu(scan); 
	 
	 
		if  (opcao == 1) { // Consultar contao
			consultarContato(scan, agenda);
			try {
			    String nomeContato = null;
				if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
				 System.out.println("Contato existe:");
			   }
			    
			}  catch (ContatoNaoExisteException e) {
				 System.out.println(e.getMessage());
			}
				
		  }else if(opcao == 2) { // Adicionar contato
			
			  
		}
		
		else if (opcao == 3) { // Sair.
			System.exit(0);
		}
		
	}
	  
	
    public static void adicionarContato(Scanner scan,Agenda aenda) {
    	System.out.println("Crando um contato entre as informações");
    	String nome = lerInformacaoString(scan, "Entre com o nome do contato");
    	String telefone = lerInformacaoString(scan, "Entre com o telefone do contato");
    	String email = lerInformacaoString(scan, "Entre com o email do contato");
    	
    	// \\contato sera atualizado 
    	Contato contato = new Contato();
    	contato.setNome(nome);
    	contato.setEmail(email);
    	contato.setTelefone(telefone);
    	
    	System.out.println("Contato a ser criado");
    	System.out.println(contato);
    	
    	
		Agenda agenda;
		agenda.adicionarContato(contato); 
    } catch (AgendaCheiaException e) {
    	System.out.println(e.getMessage());
    	
    	System.out.println("Contatos da Agenda:");
    	char[] agenda;
		System.out.println(agenda);
      }
   }
    
	public static void consultarContato(Scanner scan, Agenda agenda) {
		
		String nomeContato = lerInformacaoString(scan, "Entre com o nome do contato");
		try {
		    if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
			 System.out.println("Contato existe:");
		   }
		}  catch (ContatoNaoExisteException e) {
			 System.out.println(e.getMessage());
		}
	}
	
	
	  public static String lerInformacaoString(Scanner scan, String msg) {
		  System.out.println(msg);
		  String entrada = scan.nextLine();
		  return entrada;
		
	  }
	  
	  
	  public static int obterOpcaoMenu(Scanner scan) {
		
		boolean entradaValida = false;
		int opcao = 3;
		
		// enquanto a entrada nao for valida, o usuario tera que digitar uma dessas opções.
		while(!entradaValida) {
			
			System.out.println("Digite a opcao desejada:");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar COntato");
			System.out.println("3: Sair");
			
	
			
			
			// Tratando a String (Transformar a String no inteiro
			try {				
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if(opcao == 1 || opcao == 2 || opcao == 3) {
					 entradaValida = true;
				} else {
					throw new Exception("Entrada inválida!");
				}
			}
			
			catch (Exception e) {
			   System.out.println("Entrada valida, digite novamente:");
			}
		}

		
		return opcao;
	}
}

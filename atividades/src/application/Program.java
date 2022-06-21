package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import des_interfaces.Contract;
import des_interfaces.Installment;
import services.ContractService;
import services.OnlinePaymentService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US); // para transformar o ponto e virgula.
		Scanner sc = new Scanner(System.in);
		
	   System.out.println("Enter contact data");
	   System.out.print("Number");
	   Integer number = sc.nextInt();
	   System.out.print("Date (dd/MM/yyyy): ");
	   Date date = sdf.parse(sc.next());
	   System.out.print("Contract value:");
	   Double totalValue = sc.nextDouble();
	   
	
	    Contract contract = new Contract(number, date, totalValue);
	    
	    // Numero de Parcelas.
	    System.out.println("Enter the installments"); 
	    int N = sc.nextInt();
	    
	    ContractService cs = new ContractService(new PaypalService());
	    // Instacia da Parcela
	    
	    cs.processContract(contract, N);
	    
	    System.out.println("Installments");
	    // Pra cada Parcela, na minha lista do contrato, 
	    for(Installment it: contract.getInstallments()) {
	    	System.out.println(it);
	    }
	    
	sc.close();
	}
}

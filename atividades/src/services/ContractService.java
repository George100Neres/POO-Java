package services;

import java.util.Calendar;
import java.util.Date;

import des_interfaces.Contract;
import sobrecarga_metodo.Installment;

public class ContractService {

	 // inversao de Controle.
	private OnlinePaymentService onlinepaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinepaymentService = onlinePaymentService;
	}
	// va instaciar o N Objetos do contrato.
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		// basicQuota vale 200
		for (int i=1; i<= months; i++) {
			double updatedQuota = basicQuota + onlinepaymentService.interest(basicQuota, i);
			// updatedQuota = 202.
			double fullQuota = updatedQuota + onlinepaymentService.paymentFee(updatedQuota);
			// fullQuota 206.04
			Date dueDate = addMonths(contract.getDate(), i); // pego a data do contrato, e adiciono nessa data(i) meses. 
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}
	
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(calendar.MONTH, N);
		return calendar.getTime();
	}
}

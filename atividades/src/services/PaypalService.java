package services;

public class PaypalService implements OnlinePaymentService{

	private static final double PAYMENT_FEE = 0.02; // Pagamento parcelado
	private static final double MONTHLY_INTEREST = 0.01; // Juro Mensal
	
	
	@Override
	public double paymentFee(Double amount) {
		return amount * PAYMENT_FEE ;
	}
 // Pega a quantia, multiĺica pela quantidade de juros e meses;
	@Override
	public double interest(double amount, int months) {
		
		return amount * months * MONTHLY_INTEREST;
	}

	
}

package des_interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private Date Duedate;
	private Double amount;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Installment(Date duedate, Double amount) {
		super();
		Duedate = duedate;
		this.amount = amount;
	}
	
	
	public Date getDuedate() {
		return Duedate;
	}
	public void setDuedate(Date duedate) {
		Duedate = duedate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}

 // Resultado da impressao
	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
	}
	
	
	
}

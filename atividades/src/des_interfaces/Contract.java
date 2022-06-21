package des_interfaces;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Uma grande empresa deseja automatizar o processamento de seus contratos.O processamento de um 
 * contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no número de meses desejado.
 * 
 * A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
 * Os serviços de pagamento online tipicammente cobram um juro mensal,bem como uma taxa por pagamento.Por enquanto,o serviço
 * contratado pela empresa é o do Paypal, que aplica juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
 * 
 * Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,e valor total do
 * contrato).Em seguida, o programa deve ler o numero de meses para parcelamento do contrato,e dai querer gerar os 
 * registros de parcelas a serem pagas,(data e valor.,sendo a primeira parcela a ser paga um mês após a data do contrato,
 * a segunda parcela dosi meses apos o contrato e assim por diante.Mostrar os dados das parcelas na tela
 * 
 * Exemplo:
 * 
 * Enter contract data
 * Number: 8028
 * Date (dd/MM.04
 * 
 * /yyyy)
 * Contrct value: 600.00
 * Enter number of installmensts: 3 (Numero de Parcelas.)
 * 
 * Installments:
 * 25/07/2018 - 206.04
 * 25/08/2018 - 208.08
 * 25/09/2018 - 210.12
 * 
 * 
 * Cálculos 
 * 
 * Parcela #1
 * 200 + 1% * 1 = 202
 * 202 + 2% = 206
 * 
 * Parcela #2
 * 200 + 1% * 2 = 204
 * 202 + 2% = 208.08
 * 
 * Parcela #3
 * 200 + 1% = 206
 * 202 + 2% = 210.12
 */
public class Contract {

	private int nummber;
	private Date date;
	double totalValue;
	
	List<Installment> installments = new ArrayList<Installment>();
	
	public Contract(int nummber, Date date, double totalValue) {
		super();
		this.nummber = nummber;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getNummber() {
		return nummber;
	}

	public void setNummber(int nummber) {
		this.nummber = nummber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void setInstallments(List<Installment> installments) {
		this.installments = installments;
	}
	
	
	
	
}

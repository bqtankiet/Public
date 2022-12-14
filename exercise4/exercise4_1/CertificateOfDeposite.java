package exercise4_1;

import exercise3_2.Date;

/**
 * A CD specifies the interest rate and the maturity date.
 * 
 * @author normal-pc
 *
 */
public class CertificateOfDeposite extends BankAccount {

	private double interestRate;
	private Date maturityDate;

	/**
	 * This is constructor of the CertificateOfDeposite subclass
	 * 
	 * @param name
	 * @param id
	 * @param currentBalance
	 * @param interestRate
	 * @param maturityDate
	 */
	public CertificateOfDeposite(String name, int id, double currentBalance, double interestRate, Date maturityDate) {
		super(name, id, currentBalance);
		this.interestRate = interestRate;
		this.maturityDate = maturityDate;
	}

}

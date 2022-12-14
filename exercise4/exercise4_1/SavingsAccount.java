package exercise4_1;

/**
 * Savings account includes the interest rate.
 * 
 * @author normal-pc
 *
 */
public class SavingsAccount extends BankAccount {

	private double interestRate;

	/**
	 * THis is constructor of the SavingsAccount subclass
	 * 
	 * @param name
	 * @param id
	 * @param currentBalance
	 * @param interestRate
	 */
	public SavingsAccount(String name, int id, double currentBalance, double interestRate) {
		super(name, id, currentBalance);
		this.interestRate = interestRate;
	}

}

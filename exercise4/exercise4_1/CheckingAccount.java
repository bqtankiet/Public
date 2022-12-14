package exercise4_1;

/**
 * Checking account information also includes the minimum balance. *
 * 
 * @author normal-pc
 *
 */
public class CheckingAccount extends BankAccount {

	private double minimumBalance;

	/**
	 * The constructor of the CheckingAccount subclass
	 * 
	 * @param name
	 * @param id
	 * @param currentBalance
	 * @param minimumBalance
	 */
	public CheckingAccount(String name, int id, double currentBalance, double minimumBalance) {
		super(name, id, currentBalance); // this is superclass's constructor
		this.minimumBalance = minimumBalance;
	}

}

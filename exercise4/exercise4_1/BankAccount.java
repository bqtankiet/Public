package exercise4_1;


/**
 * Develop a “bank account” program. The program keeps track of the balances in
 * a person’s bank accounts. Each account has an id number and a customer’s
 * name. There are three kinds of accounts: a checking account, a savings
 * account, and a certificate of deposit (CD). Checking account information also
 * includes the minimum balance. Savings account includes the interest rate. A
 * CD specifies the interest rate and the maturity date. Naturally, all three
 * types come with a current balance.
 * 
 * @author normal-pc
 *
 */
abstract public class BankAccount {

	protected String name;
	protected int id;
	protected double currentBalance;

	/**
	 * This constructor must be invoked in subclass Constructor
	 * 
	 * @param name           name of the customer
	 * @param id             id number of the customer
	 * @param currentBalance the balance in the account
	 * <p> Example:
	 * <pre>
	 * BankAccount acc1 = new CheckingAccount ("Earl Gray", 1729, 1250, 500);
	 * BankAccount acc2 = new CertificateOfDeposite("Ima Flat", 4104, 10123, 0.04, new Date(1,6,2005);
	 * BankAccount acc3 = new SavingsAccount ("Annie Proulx", 2992, 800, 0.035);
	 * 
	 * </pre>
	 */
	public BankAccount(String name, int id, double currentBalance) {
		this.name = name;
		this.id = id;
		this.currentBalance = currentBalance;
	}

}

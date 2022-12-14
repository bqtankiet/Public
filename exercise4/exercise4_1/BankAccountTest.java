package exercise4_1;
import exercise3_2.Date;
import junit.framework.TestCase;
/**
 * <h1>TESTING CLASS</h1>
 * @author normal-pc
 *
 */
public class BankAccountTest extends TestCase {

	public void test() {
	BankAccount acc1 = new CheckingAccount ("Earl Gray", 1729, 1250, 500);
	BankAccount acc2 = new CertificateOfDeposite("Ima Flat", 4104, 10123, 0.04, new Date(1,6,2005));
	BankAccount acc3 = new SavingsAccount ("Annie Proulx", 2992, 800, 0.035);
	}

}

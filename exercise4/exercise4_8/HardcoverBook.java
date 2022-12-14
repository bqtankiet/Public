package exercise4_8;

/**
 * HarcoverBook used to make a hardcover book object
 * @author normal-pc
 *
 */
public class HardcoverBook extends ABook {

	/**
	 * Constructor
	 * <p>
	 * Example: Book hardcover = new HardcoverBook("A WORLD OF CURIOSITIES","Louise
	 * Penny",2022,29.99,0.2);
	 * 
	 * @param title
	 * @param author
	 * @param year
	 * @param price
	 * @param princingPolicy
	 */
	public HardcoverBook(String title, String author, int year, double price, double princingPolicy) {
		super(title, author, year, price, princingPolicy);
	}

}

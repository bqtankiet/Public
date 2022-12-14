package exercise4_8;

/**
 * SaleBook class used to make an object
 * 
 * @author normal-pc
 *
 */
public class SaleBook extends ABook {

	/**Constructor
	 * <p>
	 * Example: Book saleBook = new SaleBook ("The Ultimate Sales Machine","Chet
	 * Holmes",2007,14.99,0.5);
	 * 
	 * @param title
	 * @param author
	 * @param year
	 * @param price
	 * @param princingPolicy
	 */
	public SaleBook(String title, String author, int year, double price, double princingPolicy) {
		super(title, author, year, price, princingPolicy);
	}

}

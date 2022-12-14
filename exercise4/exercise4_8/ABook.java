package exercise4_8;

public abstract class ABook implements Book {

	protected String title;
	protected String author;
	protected int year;
	protected double price;
	protected double princingPolicy;

	/**
	 * Constructor with 5 parameters.
	 * 
	 * @param title          title of the book
	 * @param author         name of author, who write the book
	 * @param year           the publication year
	 * @param price          price of book
	 * @param princingPolicy the princing policy of the book
	 */
	public ABook(String title, String author, int year, double price, double princingPolicy) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.price = price;
		this.princingPolicy = princingPolicy;
	}

	/**
	 * <pre>
	 *Example:
	 *Book hardcover = new HardcoverBook("A WORLD OF CURIOSITIES","Louise Penny",2022,29.99,0.2);
	 *assertEquals(hardcover.salePrice(),29.99-29.99*0.2);
	 *Book saleBook = new SaleBook ("The Ultimate Sales Machine","Chet Holmes",2007,14.99,0.5);
	 *assertEquals(saleBook.salePrice(),14.99-14.99*0.5);
	 *Book paperBack = new PaperBack("Wish You Were Here","Jodi Pocoult",2022,20.55,0);
	 *assertEquals(paperBack.salePrice(),20.55);
	 * </pre>
	 */
	@Override
	public double salePrice() {
		return this.price - (this.price * this.princingPolicy);
	}

	@Override
	public boolean cheaperThan(ABook that) {
		return this.salePrice() < that.salePrice();
	}

	@Override
	public boolean sameAuthor(ABook that) {
		return this.author.equals(that.author);
	}
}

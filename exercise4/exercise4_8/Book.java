package exercise4_8;

/**
 * Develop a program that assists a bookstore manager in a discount bookstore.
 * The program should keep a record for each book. The record must include its
 * title, the author's name, its price, and its publication year. In addition,
 * there are three kinds of books with different pricing policy. The hardcover
 * books are sold at 20% off. The sale books are sold at 50% off. The paperbacks
 * are sold at the list price. Here are your tasks:
 * 
 * Develop a class hierarchy for representing books in the discount bookstore.
 * 
 * Develop the following methods:
 * 
 * salePrice, which computes the sale price of each book;
 * 
 * cheaperThan, which determines whether a book is cheaper than another book;
 * 
 * sameAuthor, which determines whether a book was written by some given author
 * which wrote another book.
 * 
 * @author normal-pc
 *
 */
public interface Book {

	/**
	 * Compute the sale price of each book
	 * 
	 * @return the sale price
	 */
	public double salePrice();

	/**
	 * determine whether a book is cheaper than another book
	 * 
	 * @param that another book
	 * @return true or false
	 */
	public boolean cheaperThan(ABook that);

	/**
	 * determines whether a book was written by some given author which wrote
	 * another book.
	 * 
	 * @param that another book
	 * @return true or false
	 */
	public boolean sameAuthor(ABook that);

}

package exercise4_8;

import junit.framework.TestCase;

/**
 * <h1>TESTING CLASS</h1>
 * 
 * @author normal-pc
 *
 */
public class BookTest extends TestCase {

	public void testHardcoverBook() {
		Book hardcover = new HardcoverBook("A WORLD OF CURIOSITIES", "Louise Penny", 2022, 29.99, 0.2);
		assertEquals(hardcover.salePrice(), 29.99 - 29.99 * 0.2);
		assertFalse(hardcover.cheaperThan(new SaleBook("The Ultimate Sales Machine", "Chet Holmes", 2007, 14.99, 0.5)));
		assertFalse(hardcover.sameAuthor(new SaleBook ("The Ultimate Sales Machine","Chet Holmes",2007,14.99,0.5)));
	}

	public void testSaleBook() {
		Book saleBook = new SaleBook("The Ultimate Sales Machine", "Chet Holmes", 2007, 14.99, 0.5);
		assertEquals(saleBook.salePrice(), 14.99 - 14.99 * 0.5);
		assertTrue(saleBook.cheaperThan(new HardcoverBook("A WORLD OF CURIOSITIES", "Louise Penny", 2022, 29.99, 0.2)));
		assertTrue(saleBook.sameAuthor(new SaleBook ("The Ultimate Sales Machine","Chet Holmes",2007,14.99,0.5)));

	}

	public void testPaperBack() {
		Book paperBack = new PaperBack("Wish You Were Here", "Jodi Pocoult", 2022, 20.55, 0);
		assertEquals(paperBack.salePrice(), 20.55);
		assertFalse(paperBack.cheaperThan(new PaperBack("Wish You Were Here", "Jodi Pocoult", 2022, 20.0, 0)));
		assertFalse(paperBack.sameAuthor(new SaleBook ("The Ultimate Sales Machine","Louise Penny",2007,14.99,0.5)));
	}

}

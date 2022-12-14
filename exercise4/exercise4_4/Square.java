package exercise4_4;

/**
 * Square class used to make the square shape with the location and the size
 * 
 * @author normal-pc
 *
 */
public class Square extends AShape {

	private int size;

	/**
	 * constructor of the square class
	 * <p>
	 * Example: IShape square = new Square(new CartPt(8, 6), 3);
	 * 
	 * @param location
	 * @param size
	 */
	public Square(CartPt location, int size) {
		super(location);
		this.size = size;
	}

	/**
	 * ovverride area method, which compute the area of the square shape
	 * <p>
	 * Example: assertEquals(new Square(new CartPt(8, 6), 3),9); // true
	 * 
	 */
	@Override
	public double area() {
		return this.size * this.size;
	}

	/**
	 * override contains method used to check does the square contains a given point
	 * <p>
	 * Example
	 * 
	 * <pre>
	 * IShape square = new Square(new CartPt(8, 6), 3);
	 * assertTrue(square.contains(new CartPt(8, 6)));
	 * assertFalse(square.contains(new CartPt(12, 9)));
	 * </pre>
	 */
	@Override
	public boolean contains(CartPt point) {

		return this.location.getDx(point) >= 0 && this.location.getDy(point) >= 0 && this.location.getDx(point) <= size
				&& this.location.getDy(point) <= size;

	}

	/**
	 * this method used to get the shape bound the square
	 * <p>
	 * Example
	 * 
	 * <pre>
	 * IShape square = new Square(new CartPt(8, 6), 3);
	 * assertEquals(square.boundingBox(), new Rectangle(new CartPt(8, 6), 3, 3));
	 * 
	 * </pre>
	 */
	@Override
	public Rectangle boundingBox() {
		return new Rectangle(this.location, this.size, this.size);
	}

}

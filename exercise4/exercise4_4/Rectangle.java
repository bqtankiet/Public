package exercise4_4;

/**
 * Rectangle class used to make the Rectangle shape with the location, width and
 * height
 * 
 * @author normal-pc
 *
 */
public class Rectangle extends AShape {

	private int width, height;

	/**
	 * Constructor.
	 * <p>
	 * Example: IShape rectangle = new Rectangle(new CartPt(5, 4), 3, 4);
	 * 
	 * @param location
	 * @param width
	 * @param height
	 */
	public Rectangle(CartPt location, int width, int height) {
		super(location);
		this.width = width;
		this.height = height;
	}

	/**
	 * override area method, which compute the area of the rectangle shape
	 * <p>
	 * Example: assertEquals(new Rectangle(new CartPt(5, 4), 3, 4),12); // true
	 * 
	 * 
	 */
	@Override
	public double area() {
		return this.width * this.height;
	}

	/**
	 * override contains method used to check does the rectangle contains a given
	 * point
	 * <p>
	 * Example:
	 * 
	 * <pre>
	 * IShape rectangle = new Rectangle(new CartPt(5, 4), 3, 4);
	 * assertTrue(rectangle.contains(new CartPt(7, 5)));
	 * assertFalse(rectangle.contains(new CartPt(3, 3)));
	 * </pre>
	 */
	@Override
	public boolean contains(CartPt point) {

		return this.location.getDx(point) >= 0 && this.location.getDy(point) >= 0 && this.location.getDx(point) <= width
				&& this.location.getDy(point) <= height;
	}

	/**
	 * this method used to get the boundingbox of the rectangle *
	 * <p>
	 * Example:
	 * 
	 * <pre>
	 * IShape rectangle = new Rectangle(new CartPt(5, 4), 3, 4);
	 * assertEquals(rectangle.boundingBox(), new Rectangle(new CartPt(5, 4), 3, 4));
	 * 
	 * </pre>
	 */
	@Override
	public Rectangle boundingBox() {
		return new Rectangle(this.location, width, height);
	}

	/**
	 * ovrride equals method used to compare 2 rectangle
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle && obj != null) {
			Rectangle that = (Rectangle) obj;
			return this.location.equals(that.location) && this.height == that.height && this.width == that.width;
		}
		return false;

	}
}

package exercise4_4;

/**
 * Dot class use to make the dot shape with the location
 * 
 * @author normal-pc
 *
 */
public class Dot extends AShape {

	/**
	 * constructor
	 * <p>
	 * Example: IShape dot = new Dot(new CartPt(5, 4));
	 * 
	 * @param loc
	 */
	public Dot(CartPt loc) {
		super(loc);
	}

	/**
	 * override method area, which compute the area of the dot shape
	 * <p>
	 * Example: assertEquals(new Dot(new CartPt(5, 4)),0.0);
	 */
	@Override
	public double area() {
		return 0;
	}

	/**
	 * override contains method used to check does the dot contains the point
	 * <p>
	 * Example:
	 * 
	 * <pre>
	 * IShape dot = new Dot(new CartPt(5, 4));
	 * assertTrue(dot.contains(new CartPt(5, 4)));
	 * assertFalse(dot.contains(new CartPt(4, 4)));
	 * </pre>
	 */
	@Override
	public boolean contains(CartPt point) {
		if (this.location.equals(point))
			return true;
		return false;
	}

	/**
	 * ovrride boundingbox to get the shape bound the dot
	 * <p>
	 * Example:
	 * 
	 * <pre>
	 * assertEquals(dot.boundingBox(), new Rectangle(new CartPt(5, 4), 0, 0));
	 * </pre>
	 */
	@Override
	public Rectangle boundingBox() {
		return new Rectangle(this.location, 0, 0);
	}

}

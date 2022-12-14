package exercise4_4;

/**
 * A circle class. used to make the circle shape with location and radiuss
 * 
 * @author normal-pc
 *
 */
public class Circle extends AShape {

	private int radius;

	/**
	 * constructor.
	 * <p>
	 * Example: IShape circle = new Circle(new CartPt(3, 5), 2);
	 * 
	 * @param location
	 * @param radius
	 */
	public Circle(CartPt location, int radius) {
		super(location);
		this.radius = radius;
	}

	/**
	 * override area method, which compute the area of the circle shape
	 * <p>
	 * Example: assertEquals(new Circle(new CartPt(3, 5), 2).area(),2*2*Math.PI);
	 */
	@Override
	public double area() {
		return (this.radius * this.radius) * Math.PI;
	}

	/**
	 * override contains method use to check does the circle contains the point
	 * <p>
	 * Example:
	 * 
	 * <pre>
	 * IShape circle = new Circle(new CartPt(3, 5), 2);
	 * assertTrue(circle.contains(new CartPt(3, 3)));
	 * assertTrue(circle.contains(new CartPt(5, 5)));
	 * assertFalse(circle.contains(new CartPt(6, 5)));
	 * </pre>
	 */
	@Override
	public boolean contains(CartPt point) {
		return this.location.distanceTo(point) <= radius;
	}

	/**
	 * ovrride boundingbox to get the shape bound the circle
	 * <p>
	 * Example:
	 * 
	 * <pre>
	 * IShape circle = new Circle(new CartPt(3, 5), 2);
	 * assertEquals(circle.boundingBox(), new Rectangle(new CartPt(1, 3), 4, 4));
	 * 
	 * </pre>
	 */
	@Override
	public Rectangle boundingBox() {

		return new Rectangle(this.location.changeLocation(-this.radius, -this.radius), this.radius * 2,
				this.radius * 2);
	}
}

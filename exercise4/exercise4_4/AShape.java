package exercise4_4;

/**An abstract AShape class. 
 * @author normal-pc
 *
 */
abstract public class AShape implements IShape {

	protected CartPt location;
	/**
	 * The constructor of an abstract class. it must be invoked inside subclass
	 * @param location 
	 */
	public AShape(CartPt location) {
		super();
		this.location = location;
	}
	
	/**
	 *distance to origrin used to compute the distance from the location of the shape to the origin
	 */
	@Override
	public double distanceToO() {
		return this.location.distanceToO();
	}
	
}

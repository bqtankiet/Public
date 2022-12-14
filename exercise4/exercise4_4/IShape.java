package exercise4_4;

/**Interface of the shape
 * @author normal-pc
 *
 */
public interface IShape {

	double area();

	double distanceToO();

	boolean contains(CartPt point);

	Rectangle boundingBox();

}

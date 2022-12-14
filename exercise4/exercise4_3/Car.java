package exercise4_3;

/**
 * @author normal-pc
 *
 */
public class Car extends Vehicle {

	private String type;
	private double price;
	/**
	 * constructor
	 * @param color
	 * @param numOfSeat
	 * @param type
	 * @param price
	 */
	public Car(String color, int numOfSeat, String type, double price) {
		super(color, numOfSeat);
		this.type = type;
		this.price = price;
	}
	
}

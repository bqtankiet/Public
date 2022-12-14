package exercise4_3;

public class Subway extends Vehicle {

	private int numOfCarriage;
	private double speed;
	/** constructor
	 * @param color
	 * @param numOfSeat
	 * @param numOfCarriage
	 * @param speed
	 */
	public Subway(String color, int numOfSeat, int numOfCarriage, double speed) {
		super(color, numOfSeat);
		this.numOfCarriage = numOfCarriage;
		this.speed = speed;
	}
	
}

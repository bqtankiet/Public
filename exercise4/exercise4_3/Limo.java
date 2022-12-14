package exercise4_3;

public class Limo extends Vehicle {

	private String type;
	private double length;
	/**
	 * constructor
	 * @param color
	 * @param numOfSeat
	 * @param type
	 * @param length
	 */
	public Limo(String color, int numOfSeat, String type, double length) {
		super(color, numOfSeat);
		this.type = type;
		this.length = length;
	}
	
}

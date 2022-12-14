package exercise4_3;

public class Bus extends Vehicle {

	private String busStation;
	private int busNumber;
	/** constructor
	 * @param color
	 * @param numOfSeat
	 * @param busStation
	 * @param busNumber
	 */
	public Bus(String color, int numOfSeat, String busStation, int busNumber) {
		super(color, numOfSeat);
		this.busStation = busStation;
		this.busNumber = busNumber;
	}
	
	
}

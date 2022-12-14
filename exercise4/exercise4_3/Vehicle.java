package exercise4_3;

abstract public class Vehicle {

	protected String color;
	protected int numOfSeat;

	/**
	 * constructor
	 * <p>
	 * Example
	 * 
	 * <pre>
	 * Vehicle bus = new Bus("Blue", 60, "LongBinh", 33);
	 * Vehicle car = new Car("Red", 4, "HatchBack", 500);
	 * Vehicle limo = new Limo("Black", 9, "Classic Vintage Limousine", 10);
	 * Vehicle subway = new Subway("While", 40, 7, 100);
	 * </pre>
	 * 
	 * @param color
	 * @param numOfSeat
	 */
	public Vehicle(String color, int numOfSeat) {
		super();
		this.color = color;
		this.numOfSeat = numOfSeat;
	}

}

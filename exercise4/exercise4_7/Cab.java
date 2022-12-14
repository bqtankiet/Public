package exercise4_7;

/**
 * A cab taxi class used to make a cab object
 * 
 * @author normal-pc
 *
 */
public class Cab extends TaxiVehicle {

	/**
	 * constructor with 3 parameters
	 * <p>
	 * Example: ITaxiVehicle cab = new Cab(16,3,5);
	 * 
	 * @param idNumb
	 * @param passengers
	 * @param pricePerMile
	 */
	public Cab(int idNumb, int passengers, int pricePerMile) {
		super(idNumb, passengers, pricePerMile);
	}

}

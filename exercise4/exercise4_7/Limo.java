package exercise4_7;

/**
 * A Limo class used to make a limo objects
 * 
 * @author normal-pc
 *
 */
public class Limo extends TaxiVehicle {

	private int minRental;

	/**
	 * constructor with 4 parameters
	 * <p>
	 * Example: ITaxiVehicle limo = new Limo(03,5,35,50);
	 * 
	 * @param idNumb
	 * @param passengers
	 * @param pricePerMile
	 * @param minRental
	 */
	public Limo(int idNumb, int passengers, int pricePerMile, int minRental) {
		super(idNumb, passengers, pricePerMile);
		this.minRental = minRental;
	}

	/**
	 * passengers in a limo must pay at least the minimum rental fee, otherwise they
	 * pay by the mile
	 */
	@Override
	public double getFare(double miles) {
		return super.getFare(miles) + this.minRental;
	}
}

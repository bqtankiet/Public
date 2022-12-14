package exercise4_7;

/**
 * A Van class used to maken a van objects
 * 
 * @author normal-pc
 *
 */
public class Van extends TaxiVehicle {

	private boolean access;
	private int extra;

	/**
	 * constructor with 4 arguments
	 * <p>
	 * Example: ITaxiVehicle van = new Van(33,7,10,1, true);
	 * 
	 * @param idNumb
	 * @param passengers
	 * @param pricePerMile
	 * @param access
	 */
	public Van(int idNumb, int passengers, int pricePerMile, int extra, boolean access) {
		super(idNumb, passengers, pricePerMile);
		this.access = access;
		this.extra = extra;
	}

	/**
	 * passengers in a van pay $1.00 extra for each passenger
	 */
	@Override
	public double getFare(double miles) {
		return super.getFare(miles) + (this.passengers * this.extra);
	}

}

package exercise4_7;

/**
 * An abstract taxi vehicle class used to hold common members
 * 
 * @author normal-pc
 *
 */
abstract public class TaxiVehicle implements ITaxiVehicle {

	protected int idNumb;
	protected int passengers;
	protected int pricePerMile;

	/**
	 * constructor with 3 parameters
	 * 
	 * @param idNumb
	 * @param passengers
	 * @param pricePerMile
	 */
	protected TaxiVehicle(int idNumb, int passengers, int pricePerMile) {
		this.idNumb = idNumb;
		this.passengers = passengers;
		this.pricePerMile = pricePerMile;
	}

	@Override
	public double getFare(double miles) {
		return this.pricePerMile * miles;
	}

	@Override
	public boolean lowerPrice(double amount, double miles) {
		return this.getFare(miles) < amount;
	}

	@Override
	public boolean cheaperThan(TaxiVehicle vehicle, double miles) {
		return this.getFare(miles) < vehicle.getFare(miles);
	}

}

package exercise4_7;

/**
 * Viet chuong trinh quan li cac chuyen taxi
 * 
 * @author normal-pc
 */
public interface ITaxiVehicle {

	/**
	 * <pre>
	 * which computes the fare for a vehicle, based on the number of miles traveled,
	 * and using the following formulas for different vehicles:
	 * 
	 *<li> passengers in a cab just pay flat fee per mile
	 * 
	 *<li> passengers in a limo must pay at least the minimum rental fee, otherwise they
	 * pay by the mile
	 * 
	 *<li> passengers in a van pay $1.00 extra for each passenger
	 * </pre>
	 * 
	 * @param miles total miles traveled
	 * @return total price
	 */
	double getFare(double miles);

	/**
	 * determines whether the fare for a given number of miles is lower than some
	 * amount;
	 * 
	 * @param amount
	 * @param miles
	 * @return
	 */
	boolean lowerPrice(double amount, double miles);

	/**
	 * determines whether the fare in one vehicle is lower than the fare in another
	 * vehicle for the same number of miles.
	 * 
	 * @param miles
	 * @return
	 */
	boolean cheaperThan(TaxiVehicle vehicle, double miles);

}

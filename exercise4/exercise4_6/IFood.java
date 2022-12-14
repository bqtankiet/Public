package exercise4_6;

/**
 * <h1>INTERFACE OF FOOD</h1>
 * <p>
 * Develop a program that keeps track of the items in the grocery store. For
 * now, assume that the store deals only with ice cream, coffee, and juice. Each
 * of the items is specified by its brand name, weight (gram) and price (cents).
 * Each coffee is also labeled as either regular or decaffeinated. Juice items
 * come in different flavors, and can be packaged as frozen, fresh, bottled, or
 * canned. Each package of ice cream specifies its flavor and whether this is a
 * sorbet, a frozen yogurt, or regular ice cream.
 * 
 * Design the following methods:
 * 
 * unitPrice, which computes the unit price (cents per gram) of some grocery
 * item;
 * 
 * lowerPrice, which determines whether the unit price of some grocery item is
 * lower than some given amount;
 * 
 * cheaperThan, which determines whether a grocery item is cheaper than some
 * other, given one in terms of the unit cost.
 * 
 * @author normal-pc
 *
 */
public interface IFood {

	/**
	 * compute the unit price of the food (cents per gram)
	 * 
	 * @return
	 */
	double unitPrice();

	/**
	 * determines whether the unit price of some grocery item is lower than some
	 * given amount;
	 * 
	 * @param amount
	 * @return
	 */
	boolean lowerPrice(double amount);

	/**
	 * determines whether a grocery item is cheaper than some other, given one in
	 * terms of the unit cost.
	 * 
	 * @param food another food
	 * @return
	 */
	boolean cheaperThan(Food food);

}

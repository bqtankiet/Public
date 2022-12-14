package exercise4_6;

/**
 * an abstract class food hold common members of the food
 * @author normal-pc
 */
public abstract class Food implements IFood {

	protected String brandName;
	protected double weight;
	protected double price;

	/**
	 * Constructor, get and assign 3 arguments to common fields
	 * 
	 * @param brandName name of item brand
	 * @param weight    gram
	 * @param price     cents
	 */
	protected Food(String brandName, double weight, double price) {
		this.brandName = brandName;
		this.weight = weight;
		this.price = price;
	}

	/**
	 * compute the unit price of the food
	 */
	@Override
	public double unitPrice() {
		return this.price / this.weight;
	}

	/**
	 * determines whether the unit price of some grocery item is lower than some
	 * given amount;
	 */
	@Override
	public boolean lowerPrice(double amount) {
		return this.unitPrice() < amount;
	}

	/**
	 * determines whether a grocery item is cheaper than some other, given one in
	 * terms of the unit cost.
	 */
	@Override
	public boolean cheaperThan(Food food) {
		return this.unitPrice() < food.unitPrice();
	}

}

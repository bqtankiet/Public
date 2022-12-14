package exercise4_6;

/**
 * The class Ice cream used to make an ice cream object, it extends Food class
 * 
 * @author normal-pc
 *
 */
public class IceCream extends Food {

	private String flavor;
	private String type;

	/**
	 * Constructor with 5 parameters
	 * <p>
	 * Example: IFood iceCream = new IceCream ("Fritter",10,15,"sweet","sorbet");
	 * 
	 * @param brandName {@link Food}
	 * @param weight    {@link Food}
	 * @param price     {@link Food}
	 * @param flavor    flavor of ice cream
	 * @param type      whether this is a sorbet, a frozen yogurt, or regular ice
	 *                  cream.
	 */
	public IceCream(String brandName, double weight, double price, String flavor, String type) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this.type = type;
	}

}

package exercise4_6;

/**
 * A Coffee class extends food, used to make a coffee object
 * 
 * @author normal-pc
 *
 */
public class Coffee extends Food {

	private String type;

	/**
	 * Constructor with 4 parameters
	 * <p>
	 * Example: IFood coffee = new Coffee("Trung Nguyen",50,30,"Regular");
	 * 
	 * 
	 * @param brandName {@link Food}
	 * @param weight    {@link Food}
	 * @param price     {@link Food}
	 * @param type      regular or decaffeinated.
	 */
	public Coffee(String brandName, double weight, double price, String type) {
		super(brandName, weight, price);
		this.type = type;
	}

}

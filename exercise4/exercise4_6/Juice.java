package exercise4_6;

/**
 * A Juice class used to make a juice object
 * 
 * @author normal-pc
 *
 */
public class Juice extends Food {

	private String flavor;
	private String type;

	/**
	 * Constructor with 5 arguments
	 * <p>
	 * Example: IFood juice = new Juice("CoCa",100,35,"Sweet","Bottled");
	 * 
	 * @param brandName {@link Food}
	 * @param weight    {@link Food}
	 * @param price     {@link Food}
	 * @param flavor    a flavor of juice
	 * @param type      frozen, fresh, bottled, or canned.
	 */
	public Juice(String brandName, double weight, double price, String flavor, String type) {
		super(brandName, weight, price);
		this.flavor = flavor;
		this.type = type;
	}

}

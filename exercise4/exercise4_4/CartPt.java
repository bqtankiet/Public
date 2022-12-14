package exercise4_4;

/**
 * CartPt class used to create the point with x side and y side
 * 
 * @author normal-pc
 *
 */
public class CartPt {

	private int xSide;
	private int ySide;

	/**
	 * Constructor get x side and y side of the Shape location.
	 * 
	 * @param xSide
	 * @param ySide
	 */
	public CartPt(int xSide, int ySide) {
		super();
		this.xSide = xSide;
		this.ySide = ySide;
	}

	/**
	 * distanceToO used to compute the distrance from one point to the origin
	 * <p>
	 * Example: assertEquals(new CartPt(3,4).distanceToO(),5); // true
	 * 
	 * @return
	 */
	public double distanceToO() {
		return Math.sqrt(xSide * xSide + ySide * ySide);
	}

	/**
	 * override equalse method use to compare two CartPt
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CartPt && obj != null) {
			CartPt that = (CartPt) obj;
			return this.xSide == that.xSide && that.ySide == that.ySide;
		}
		return false;
	}

	/**
	 * distanceTo used to get the distance between two point
	 * 
	 * @param point another cartpt
	 * @return the distance between two point
	 */
	public double distanceTo(CartPt that) {
		int xLength = Math.abs(this.xSide - that.xSide);
		int yLength = Math.abs(this.ySide - that.ySide);
		return Math.sqrt(xLength * xLength + yLength * yLength);
	}

	/**
	 * getDx method, which compute the distance between two x point of the point
	 * 
	 * @param that
	 * @return
	 */
	public int getDx(CartPt that) {
		return (that.xSide - this.xSide);
	}

	/**
	 * getDy method, which compute the distance between two y point of the point
	 * 
	 * @param point
	 * @return
	 */
	public int getDy(CartPt that) {
		// TODO Auto-generated method stub
		return (that.ySide - this.ySide);

	}

	/** changeLocation method used to change the location of a point
	 * @param i
	 * @param j
	 * @return
	 */
	public CartPt changeLocation(int i, int j) {
		return new CartPt(this.xSide+i,this.ySide+j);
	}

}

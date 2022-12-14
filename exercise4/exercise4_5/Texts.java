package exercise4_5;

/**
 * Texts specify the number of lines needed for visual representation
 * 
 * @author normal-pc
 *
 */
public class Texts extends File {

	private int numOfLines;

	/**
	 * Constructor
	 * 
	 * @param srcFile
	 * @param size
	 * @param numOfLines
	 */
	public Texts(String srcFile, double size, int numOfLines) {
		super(srcFile, size);
		this.numOfLines = numOfLines;
	}

}

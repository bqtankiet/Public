package exercise4_5;

/**
 * Images include information about the height, the width, and the quality of
 * the image
 * 
 * @author normal-pc
 *
 */
public class Images extends File {

	private int height, width;
	private String quality;

	/**
	 * Constructor
	 * 
	 * @param srcFile
	 * @param size
	 * @param height
	 * @param width
	 * @param quality
	 */
	public Images(String srcFile, double size, int height, int width, String quality) {
		super(srcFile, size);
		this.height = height;
		this.width = width;
		this.quality = quality;
	}

}

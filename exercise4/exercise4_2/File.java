package exercise4_2;

/**
 * Develop a program that creates a gallery from three different kinds of
 * records: images (gif), texts (txt), and sounds (mp3). All have names for
 * source files and sizes (number of bytes). Images also include information
 * about the height, the width, and the quality of the image. Texts specify the
 * number of lines needed for visual representation. Sounds include information
 * about the playing time of the recording, given in seconds.
 * 
 * @author normal-pc
 *
 */
abstract public class File {

	protected String srcFile;
	protected double size;

	/**
	 * Constructor of the file class, it gets scrFile and size
	 * 
	 * @param srcFile
	 * @param size
	 */
	public File(String srcFile, double size) {
		this.srcFile = srcFile;
		this.size = size;
	}

}

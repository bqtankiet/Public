package exercise4_2;

public class Sounds extends File {

	private int playingTime; // seconds

	/** Constructorss
	 * @param srcFile
	 * @param size
	 * @param playingTime given in seconds
	 */
	public Sounds(String srcFile, double size, int playingTime) {
		super(srcFile, size);
		this.playingTime = playingTime;
	}
	
	
}

package exercise4_2;

import junit.framework.TestCase;

public class FileTest extends TestCase {

	/**
	 * an image, stored in flower.gif; size: 57,234 bytes; width: 100 pixels;
	 * height: 50 pixels; quality: medium;
	 * 
	 * a text, stored in welcome.txt; size: 5,312 bytes; 830 lines;
	 * 
	 * a music piece, stored in theme.mp3; size: 40960 bytes, playing time 3 minutes
	 * and 20 seconds.
	 */
	public void test() {

		File file1 = new Images("flower.gif",57.234,100,50,"medium");
		File file2 = new Texts("welcome.txt",5.312,830);
		File file3 = new Sounds("theme.mp3",40960,200);
		
	}

}

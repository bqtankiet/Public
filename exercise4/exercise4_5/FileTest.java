package exercise4_5;

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

		IFile file1 = new Images("flower.gif", 57234, 100, 50, "medium");
		IFile file2 = new Texts("welcome.txt", 5312, 830);
		IFile file3 = new Sounds("theme.mp3", 40960, 200);
		IFile file4 = new Sounds("bigTheme.mp3", 52130, 200);

		// test method
		assertTrue(file1.smallerThan(60000));
		assertFalse(file2.smallerThan(4000));
		assertFalse(file3.smallerThan(40960));

		assertTrue(file1.sameName("flower.gif"));
		assertFalse(file3.sameName("welcome.txt"));

		assertEquals(file1.timeToDownload(5000), 11.4468);
		assertEquals(file2.timeToDownload(3000), 1.77, 0.1);
		assertEquals(file3.timeToDownload(3000), 13.66, 01);
		assertEquals(file4.timeToDownload(300), 173.8, 0.1);
		
	}

}

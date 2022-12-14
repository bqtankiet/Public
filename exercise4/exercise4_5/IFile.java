package exercise4_5;

public interface IFile {

	boolean smallerThan(double maxSize);
	public boolean sameName(String name);
	double timeToDownload(int bytesPerSecond);

}

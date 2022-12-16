package ex5_3;

public class Course {

	private int number;
	private String title;
	private int credit;
	public Course(int number, String title, int credit) {
		super();
		this.number = number;
		this.title = title;
		this.credit = credit;
	}
	@Override
	public String toString() {
		return this.number +", "+ this.title+", "+this.credit+": ";
	}
	
	
	
}

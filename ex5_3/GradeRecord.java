package ex5_3;

public class GradeRecord {

	private Course course;
	private double grade;
	public GradeRecord(Course course, double grade) {
		super();
		this.course = course;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return this.course.toString()+" "+this.grade+"\n";
	}
	
	
	
}

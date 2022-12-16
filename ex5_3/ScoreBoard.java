package ex5_3;

public class ScoreBoard {

	private Student student;
	private GradeRecordList listScore;
	public ScoreBoard(Student student, GradeRecordList listScore) {
		super();
		this.student = student;
		this.listScore = listScore;
	}
	@Override
	public String toString() {
		return String.format("---ScoreBoard--- \n%s \n%s",this.student,this.listScore);
	}
	
	
	
}

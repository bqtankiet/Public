package ex5_3;

public class Cons implements  GradeRecordList {

	private GradeRecord first;
	private GradeRecordList rest;
	public Cons(GradeRecord first, GradeRecordList rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	@Override
	public String toString() {
		return this.first.toString() + this.rest.toString();
	}
	
	
	
}

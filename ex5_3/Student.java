package ex5_3;

public class Student {

	private String name;
	private int classes;
	public Student(String name, int classes) {
		super();
		this.name = name;
		this.classes = classes;
	}
	@Override
	public String toString() {
		return this.name+" "+this.classes;
	}
	
	
	
}

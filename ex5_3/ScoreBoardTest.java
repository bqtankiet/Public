package ex5_3;

import junit.framework.TestCase;

public class ScoreBoardTest extends TestCase {

	public void test() {
	// Cac mon hoc
	Course course1 = new Course (211,"Database Fundamentals",3);
	Course course2 = new Course (220,"Basic Programming",2);
	Course course3 = new Course (690,"Algorithms",4);
	Course course4 = new Course (721,"Data Structure",4);

	// Diem cua cac mon hoc
	GradeRecord record1 = new GradeRecord(course1,7.5);
	GradeRecord record2 = new GradeRecord(course2,5.0);
	GradeRecord record3 = new GradeRecord(course3,7.0);
	GradeRecord record4 = new GradeRecord(course4,8.0);
	
	// Danh sach diem
	GradeRecordList list1 = new Cons(record1, new Cons(record2, new Cons(record3, new Cons(record4, new Empty()))));
	
	// Sinh vien Tran Van Hoa
	Student student1 = new Student ("Tran Van Hoa",2019);
	
	// Bang diem cua sinh vien Tran Van Hoa
	ScoreBoard scoreBoard1 = new ScoreBoard(student1,list1);
	
	// In ra bang diem
	System.out.println(scoreBoard1);

}// close test
}// close class Test

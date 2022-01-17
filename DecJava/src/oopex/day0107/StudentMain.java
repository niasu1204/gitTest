package oopex.day0107;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.studentID = 1;
		s1.studentName = "자바킴";
		s1.grade = 2;
		s1.address = "서울 종로구";
		s1.showStudentInfo();
		
		Student s2 = new Student();
		s2.studentID = 2;
		s2.studentName = "자바초이";
		s2.grade = 1;
		s2.address ="서울 중구";
		s2.showStudentInfo();
				
	}

}

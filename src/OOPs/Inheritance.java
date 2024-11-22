
class College {
	void collegeCode() {
		System.out.println("college code is 9921");
	}
}

class Student extends College {
	void studentId() {
		System.out.println("my student id is 122");
	}
}

public class Inheritance {

	public static void main(String[] args) {

		Student student = new Student();
		student.collegeCode();
		student.studentId();

	}

}

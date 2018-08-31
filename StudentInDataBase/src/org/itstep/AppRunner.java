package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		Student student = new Student(2, "Sigizmund", "Dunplunpinkovski", 97, "CT-22");
		StudentDAO saveStudent = new StudentDAO();
		saveStudent.saveStudent(student);
	}

}
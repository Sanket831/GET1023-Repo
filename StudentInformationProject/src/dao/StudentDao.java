package dao;

import java.util.List;
import Model.Registration;
import Model.Student;


public interface StudentDao {
	Student addNewStudent(Student student);
	Student updateStudentProfile(Student student);
	boolean registration(Registration registration);
	Student findStudentByRollNo(int rollNo);
	List<Student> viewAllStudents();
}


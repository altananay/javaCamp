package javaDay3;

public class StudentManager extends UserManager{
	
	public void doHomework(Student student)
	{
		System.out.println(student.getFirstName() + " " + student.getLastName() + " �devi yapt�");
	}
	
	public void uploadHomework (Student student)
	{
		System.out.println(student.getFirstName() + " " + student.getLastName() + " �devi y�kledi");
	}
}

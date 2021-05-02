package javaDay3;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "deneme@ggggg.com");
		System.out.println(user.getUserID());
		System.out.println(user.getEmail());
		Instructor instructor = new Instructor(2, "abc@ggggg.com", "Engin", "DEMÝROÐ");
		System.out.println(instructor.getUserID());
		System.out.println(instructor.getEmail());
		System.out.println(instructor.getFirstName());
		System.out.println(instructor.getLastName());
		Student student = new Student();
		student.setUserID(3);
		student.setEmail("bce@gmail.com");
		student.setFirstName("Altan");
		student.setLastName("ANAY");
		System.out.println(student.getUserID());
		System.out.println(student.getEmail());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		UserManager userManager = new UserManager();
		userManager.LogIn(student);
		userManager.LogOut(student);
		StudentManager studentManager = new StudentManager();
		studentManager.doHomework(student);
		studentManager.uploadHomework(student);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.openLiveStream(instructor);
		instructorManager.closeLiveStream(instructor);
	}

}

package javaDay3;

public class InstructorManager extends UserManager {
	public void openLiveStream(Instructor instructor)
	{
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " canlý yayýný açtý");
	}
	
	public void closeLiveStream(Instructor instructor)
	{
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " canlý yayýný kapattý");
	}
}

package javaDay3;

public class InstructorManager extends UserManager {
	public void openLiveStream(Instructor instructor)
	{
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " canl� yay�n� a�t�");
	}
	
	public void closeLiveStream(Instructor instructor)
	{
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " canl� yay�n� kapatt�");
	}
}

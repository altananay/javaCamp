package javaDay2;

public class CourseManager {
	public void addCourse(Course course)
	{
		System.out.println(course.courseName + " eklendi.");
	}
	
	public void removeCourse(Course course)
	{
		System.out.println(course.courseName + " silindi.");
	}
}

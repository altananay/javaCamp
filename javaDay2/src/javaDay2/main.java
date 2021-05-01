package javaDay2;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C#", "Engin DEM�RO�");
		Course course2 = new Course(2, "Java", "Engin DEM�RO�");
		
		Course[] courses = {course1,course2};
		
		System.out.println("Kurslar...");
		
		for (Course course:courses)
		{
			System.out.println(course.courseName);
		}
		
		Instructor instructor1 = new Instructor(1, "Engin", "DEM�RO�");
		Instructor instructor2 = new Instructor(2, "Altan", "ANAY");
		
		Instructor[] instructors = {instructor1,instructor2};
		
		System.out.println("E�itmenler...");
		
		for(Instructor instructor : instructors)
		{
			System.out.println(instructor.Name + " " + instructor.Surname);
		}

		CourseManager courseManager = new CourseManager();
		Course course3 = new Course(3, "Python", "Engin DEM�RO�");
		courseManager.addCourse(course3);
		courseManager.removeCourse(course3);
		
		
	}

}

package database;

import entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile sisteme eklendi : " + course.getCourseName());
		
	}

}

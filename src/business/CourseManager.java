package business;

import java.util.List;

import core.logger.Logger;
import database.CourseDao;
import entities.Course;

public class CourseManager {
	private List<Course> courses;
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courses = courses;
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		for (Course courseList : courses) {
			if(course.getCourseName().equals(courseList.getCourseName())) 
				throw new Exception("Kurs ismi tekrar edemez.");
			 if (course.getCoursePrice() < 0) {
				throw new Exception("Kurs fiyatı sıfırdan küçük olamaz.");
			}
				
				
			}
		courseDao.add(course);
		courses.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}

import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logger.DatabaseLogger;
import core.logger.FileLogger;
import core.logger.Logger;
import database.CourseDao;
import database.HibernateCategoryDao;
import database.HibernateCourseDao;
import database.HibernateInstructorDao;
import database.InstructorDao;
import database.JdbcCategoryDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
	
		
		List<Instructor> instructors = new ArrayList< >();
		List<Course> courses = new ArrayList< >();
		List<Category> categories = new ArrayList < >();
		
		Logger[] loggers = {new FileLogger(), new DatabaseLogger()};
		
		InstructorManager instructorManager = new InstructorManager (new HibernateInstructorDao(),instructors, loggers);
		Instructor instructor1 = new Instructor("Engin Demirog");
		Instructor instructor2= new Instructor("Engin Demirog");
		
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		
		
		Course course1 = new Course("Java", 1500);
		Course course2 = new Course("C#" , 1000);
		
			//courseManager.add(course1);
			//courseManager.add(course2);
		CategoryManager categoryManager = new CategoryManager(categories, loggers, new JdbcCategoryDao());
		Category category1 = new Category("Programlama");
		Category category2 = new Category("Programlama1");
			//categoryManager.add(category1);
			//categoryManager.add(category2);
		
			
		
		
	}

}

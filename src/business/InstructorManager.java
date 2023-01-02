package business;

import java.util.List;

import core.logger.Logger;
import database.InstructorDao;
import entities.Instructor;


public class InstructorManager {
	private List<Instructor> instructors;
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, List<Instructor> instructor, Logger[] loggers) {
		this.instructors = instructor;
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) throws Exception {
		for (Instructor instructorList : instructors) {
			if(instructor.getName().equals(instructorList.getName())) {
				throw new Exception("Bu eğitmen zaten var!");
			}
				
			
		}
		
		instructorDao.add(instructor); 
		instructors.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
}

package database;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile eklendi: " + instructor.getName());
		
	}

}

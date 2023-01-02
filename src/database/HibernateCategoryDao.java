package database;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile sisteme eklendi : " + category.getCategoryName());
		
	}

}

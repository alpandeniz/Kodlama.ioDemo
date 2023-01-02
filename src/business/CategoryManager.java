package business;


import java.util.List;

import core.logger.Logger;
import database.CategoryDao;
import entities.Category;

public class CategoryManager {
	private List<Category> categories;
	private Logger[] loggers;
	private CategoryDao categoryDao;



	public CategoryManager(List<Category> categories, Logger[] loggers, CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}



	public void add(Category category) throws Exception {
		for (Category categoryList : categories) {
			if (category.getCategoryName().equals(categoryList.getCategoryName())) 
				throw new Exception("Kategori ismi tekrar edemez!");
			
		}
		categoryDao.add(category);
		categories.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		
	}
	
}

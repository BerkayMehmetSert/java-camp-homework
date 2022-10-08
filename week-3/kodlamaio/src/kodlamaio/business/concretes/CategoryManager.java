package kodlamaio.business.concretes;

import kodlamaio.business.abstracts.CategoryService;
import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.abstracts.CategoryDao;
import kodlamaio.entities.Category;

public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    
    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    
    @Override
    public void add(Category category) throws Exception {
        for (Category categories : this.categoryDao.getAll()) {
            if (categories.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Category already exists. Category name: " + category.getCategoryName());
            }
        }
        categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName() + " category added.");
        }
    }
}

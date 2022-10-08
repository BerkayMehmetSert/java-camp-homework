package kodlamaio.dataAccess.concretes;

import kodlamaio.dataAccess.abstracts.CategoryDao;
import kodlamaio.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class JpaCategoryDao implements CategoryDao {
    List<Category> categories = new ArrayList<Category>();
    
    @Override
    public void add(Category category) {
        categories.add(category);
        System.out.println("Added with JPA: " + category.getCategoryName());
    }
    
    @Override
    public List<Category> getAll() {
        return categories;
    }
}

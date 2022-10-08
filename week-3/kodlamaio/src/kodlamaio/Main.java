package kodlamaio;

import kodlamaio.business.abstracts.CategoryService;
import kodlamaio.business.abstracts.CourseService;
import kodlamaio.business.abstracts.InstructorService;
import kodlamaio.business.concretes.CategoryManager;
import kodlamaio.business.concretes.CourseManager;
import kodlamaio.business.concretes.InstructorManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.EmailLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.concretes.HibernateCategoryDao;
import kodlamaio.dataAccess.concretes.HibernateCourseDao;
import kodlamaio.dataAccess.concretes.JpaInstructorDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new EmailLogger(), new FileLogger(), new DatabaseLogger()};
        
        Instructor instructor1 = new Instructor(1, "Engin", "Demirog");
        Instructor instructor2 = new Instructor(2, "Engin", "Demirog");
        
        InstructorService instructorService = new InstructorManager(new JpaInstructorDao(), loggers);
//        instructorService.add(instructor1);
//        instructorService.add(instructor2);
        
        Category category1 = new Category(1, "Java");
        Category category2 = new Category(2, "C#");
        Category category3 = new Category(3, "C#");
        
        CategoryService categoryService = new CategoryManager(new HibernateCategoryDao(), loggers);
//        categoryService.add(category1);
//        categoryService.add(category2);
//        categoryService.add(category3);
        
        Course course1 = new Course(1, "Java", "Java", 100, category1, instructor1);
        Course course2 = new Course(2, "C#", "C#", 100, category2, instructor1);
        Course course3 = new Course(3, "C#", "C#", 100, category2, instructor2);
        
        CourseService courseService = new CourseManager(new HibernateCourseDao(), loggers);
        courseService.add(course1);
        courseService.add(course2);
        courseService.add(course3);
    }
}
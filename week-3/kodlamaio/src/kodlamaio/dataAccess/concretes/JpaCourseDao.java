package kodlamaio.dataAccess.concretes;

import kodlamaio.dataAccess.abstracts.CourseDao;
import kodlamaio.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JpaCourseDao implements CourseDao {
    List<Course> courses = new ArrayList<Course>();
    
    @Override
    public void add(Course course) {
        courses.add(course);
        System.out.println("Added with JPA: " + course.getCourseName());
    }
    
    @Override
    public List<Course> getAll() {
        return courses;
    }
}

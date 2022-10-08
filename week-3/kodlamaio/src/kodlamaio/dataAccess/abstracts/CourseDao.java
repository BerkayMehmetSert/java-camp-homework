package kodlamaio.dataAccess.abstracts;

import kodlamaio.entities.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);
    List<Course> getAll();
}

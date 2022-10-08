package kodlamaio.business.concretes;

import kodlamaio.business.abstracts.CourseService;
import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.abstracts.CourseDao;
import kodlamaio.entities.Course;

public class CourseManager implements CourseService {
    private CourseDao courseDao;
    private Logger[] loggers;
    
    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    
    @Override
    public void add(Course course) throws Exception {
        for (Course courses : courseDao.getAll()) {
            if (courses.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Course already exists. Course name: " + course.getCourseName());
            }
        }
        if (course.getCoursePrice() < 0) {
            throw new Exception("Course price cannot be negative. Course name: " + course.getCourseName());
        }
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getCourseName() + " course added.");
        }
    }
}

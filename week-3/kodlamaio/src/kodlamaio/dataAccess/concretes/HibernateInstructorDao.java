package kodlamaio.dataAccess.concretes;

import kodlamaio.dataAccess.abstracts.InstructorDao;
import kodlamaio.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class HibernateInstructorDao implements InstructorDao {
    List<Instructor> instructors = new ArrayList<Instructor>();
    
    @Override
    public void add(Instructor instructor) {
        instructors.add(instructor);
        System.out.println("Added with Hibernate: " + instructor.getInstructorName() + " " + instructor.getInstructorLastName());
    }
    
    @Override
    public List<Instructor> getAll() {
        return instructors;
    }
}

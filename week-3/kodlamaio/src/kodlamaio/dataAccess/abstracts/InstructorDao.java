package kodlamaio.dataAccess.abstracts;

import kodlamaio.entities.Instructor;

import java.util.List;

public interface InstructorDao {
    void add(Instructor instructor);
    
    List<Instructor> getAll();
}

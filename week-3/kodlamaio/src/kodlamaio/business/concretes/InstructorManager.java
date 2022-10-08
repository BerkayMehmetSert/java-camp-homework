package kodlamaio.business.concretes;

import kodlamaio.business.abstracts.InstructorService;
import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.abstracts.InstructorDao;
import kodlamaio.entities.Instructor;

public class InstructorManager implements InstructorService {
    private InstructorDao instructorDao;
    private Logger[] loggers;
    
    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }
    
    @Override
    public void add(Instructor instructor) {
        this.instructorDao.add(instructor);
        for (Logger logger : loggers) {
            logger.log(instructor.getInstructorName() + " " + instructor.getInstructorLastName() + " added.");
        }
    }
}

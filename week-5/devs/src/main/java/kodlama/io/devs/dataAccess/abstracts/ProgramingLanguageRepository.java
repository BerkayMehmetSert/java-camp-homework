package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.ProgramingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramingLanguageRepository extends JpaRepository<ProgramingLanguage, Integer> {
    boolean existsByNameIgnoreCase(String name);
}

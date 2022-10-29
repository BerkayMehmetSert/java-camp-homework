package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgramingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramingLanguageManager implements ProgramingLanguageService {
    private ProgramingLanguageRepository programingLanguageRepository;

    public ProgramingLanguageManager(ProgramingLanguageRepository programingLanguageRepository) {
        this.programingLanguageRepository = programingLanguageRepository;
    }

    @Override
    public List<ProgramingLanguage> getAll() throws Exception {
        if (programingLanguageRepository.getAll().isEmpty()) throw new Exception("There is no language in the system");
        return programingLanguageRepository.getAll();
    }

    @Override
    public ProgramingLanguage getById(int id) throws Exception {
        for (ProgramingLanguage language : programingLanguageRepository.getAll()) {
            if (language.getId() == id) return language;
        }
        throw new Exception("There is no language with this id : " + id);
    }

    @Override
    public void addLanguage(ProgramingLanguage language) throws Exception {
        if (language.getId() == 0) throw new Exception("Language id cannot be empty");
        if (language.getLanguageName().isEmpty()) throw new Exception("Language name cannot be empty");

        for (ProgramingLanguage programingLanguage : programingLanguageRepository.getAll()) {
            if (programingLanguage.getLanguageName().toLowerCase().equals(language.getLanguageName().toLowerCase()) ||
                    programingLanguage.getId() == language.getId()) {
                throw new Exception("Language already exists");
            }
        }
        programingLanguageRepository.addLanguage(language);
    }

    @Override
    public void updateLanguage(int id, ProgramingLanguage language) throws Exception {
        if (language.getLanguageName().isEmpty()) throw new Exception("Language name cannot be empty");
        for (ProgramingLanguage programingLanguage : programingLanguageRepository.getAll()) {
            if (programingLanguage.getLanguageName().toLowerCase().equals(language.getLanguageName().toLowerCase())) {
                throw new Exception("Language already exists");
            }
        }
        programingLanguageRepository.updateLanguage(id, language);
    }

    @Override
    public void deleteLanguage(int id) throws Exception {
        if (programingLanguageRepository.getAll().isEmpty()) throw new Exception("There is no language in the system");
        for (ProgramingLanguage language : programingLanguageRepository.getAll()) {
            if (language.getId() == id) {
                programingLanguageRepository.deleteLanguage(id);
                return;
            }
            throw new Exception("There is no language with this id : " + id);
        }

    }
}

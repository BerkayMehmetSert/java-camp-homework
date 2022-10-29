package kodlama.io.devs.dataAccess.concretes;

import kodlama.io.devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgramingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgramingLanguageRepository implements ProgramingLanguageRepository {
    List<ProgramingLanguage> languages;

    public InMemoryProgramingLanguageRepository() {
        languages = new ArrayList<ProgramingLanguage>();
    }

    @Override
    public List<ProgramingLanguage> getAll() throws Exception {
        return languages;
    }

    @Override
    public ProgramingLanguage getById(int id) throws Exception {
        return languages.stream().filter(language -> language.getId() == id).findFirst().get();
    }

    @Override
    public void addLanguage(ProgramingLanguage language) throws Exception {
        languages.add(language);
    }

    @Override
    public void updateLanguage(int id, ProgramingLanguage language) throws Exception {
        ProgramingLanguage languageToUpdate = getById(id);
        languageToUpdate.setLanguageName(language.getLanguageName());
    }

    @Override
    public void deleteLanguage(int id) throws Exception {
        languages.remove(getById(id));
    }
}

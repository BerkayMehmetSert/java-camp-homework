package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.ProgramingLanguage;

import java.util.List;

public interface ProgramingLanguageRepository {
    List<ProgramingLanguage> getAll() throws Exception;

    ProgramingLanguage getById(int id) throws Exception;

    void addLanguage(ProgramingLanguage language) throws Exception;

    void updateLanguage(int id, ProgramingLanguage language) throws Exception;

    void deleteLanguage(int id) throws Exception;
}

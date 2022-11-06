package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.requests.AddProgramingLanguageRequest;
import kodlama.io.devs.business.requests.DeleteProgramingLanguageRequest;
import kodlama.io.devs.business.requests.GetByIdProgramingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateProgramingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgramingLanguagesResponse;
import kodlama.io.devs.business.responses.GetByIdProgramingLanguageResponse;

import java.util.List;

public interface ProgramingLanguageService {
    List<GetAllProgramingLanguagesResponse> getAll() throws Exception;

    GetByIdProgramingLanguageResponse getById(GetByIdProgramingLanguageRequest getByIdProgramingLanguageRequest) throws Exception;

    void add(AddProgramingLanguageRequest addProgramingLanguageRequest) throws Exception;

    void update(int id, UpdateProgramingLanguageRequest updateProgramingLanguageRequest) throws Exception;

    void delete(DeleteProgramingLanguageRequest deleteProgramingLanguageRequest) throws Exception;
}

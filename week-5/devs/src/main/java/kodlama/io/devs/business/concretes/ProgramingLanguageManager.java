package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.devs.business.requests.AddProgramingLanguageRequest;
import kodlama.io.devs.business.requests.DeleteProgramingLanguageRequest;
import kodlama.io.devs.business.requests.GetByIdProgramingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateProgramingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgramingLanguagesResponse;
import kodlama.io.devs.business.responses.GetByIdProgramingLanguageResponse;
import kodlama.io.devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgramingLanguage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgramingLanguageManager implements ProgramingLanguageService {
    private ProgramingLanguageRepository programingLanguageRepository;

    public ProgramingLanguageManager(ProgramingLanguageRepository programingLanguageRepository) {
        this.programingLanguageRepository = programingLanguageRepository;
    }

    @Override
    public List<GetAllProgramingLanguagesResponse> getAll() throws Exception {
        List<ProgramingLanguage> programingLanguages = programingLanguageRepository.findAll();
        List<GetAllProgramingLanguagesResponse> getAllProgramingLanguagesResponses = new ArrayList<GetAllProgramingLanguagesResponse>();
        if (programingLanguages.isEmpty()) {
            throw new Exception("Programing languages not found");
        }
        for (ProgramingLanguage programingLanguage : programingLanguages) {
            GetAllProgramingLanguagesResponse responseItem = new GetAllProgramingLanguagesResponse();
            responseItem.setId(programingLanguage.getId());
            responseItem.setName(programingLanguage.getName());

            getAllProgramingLanguagesResponses.add(responseItem);
        }

        return getAllProgramingLanguagesResponses;
    }

    @Override
    public GetByIdProgramingLanguageResponse getById(GetByIdProgramingLanguageRequest getByIdProgramingLanguageRequest) throws Exception {
        ProgramingLanguage programingLanguage = programingLanguageRepository.findById(getByIdProgramingLanguageRequest.getId())
                .orElseThrow(() -> new Exception("Programing language not found"));

        GetByIdProgramingLanguageResponse responseItem = new GetByIdProgramingLanguageResponse();
        responseItem.setId(programingLanguage.getId());
        responseItem.setName(programingLanguage.getName());

        return responseItem;
    }

    @Override
    public void add(AddProgramingLanguageRequest addProgramingLanguageRequest) throws Exception {
        ProgramingLanguage programingLanguage = new ProgramingLanguage();
        programingLanguage.setName(addProgramingLanguageRequest.getName());
        if (programingLanguage.getName().isEmpty() || programingLanguage.getName().isBlank()) {
            throw new Exception("Programing language name is required");
        }
        if (programingLanguageRepository.existsByNameIgnoreCase(addProgramingLanguageRequest.getName())) {
            throw new Exception("Programing language already exists");
        }
        programingLanguageRepository.save(programingLanguage);
    }

    @Override
    public void update(int id, UpdateProgramingLanguageRequest updateProgramingLanguageRequest) throws Exception {
        ProgramingLanguage programingLanguage = programingLanguageRepository.findById(id)
                .orElseThrow(() -> new Exception("Programing language not found"));
        if (programingLanguage.getName().isEmpty() || updateProgramingLanguageRequest.getName().isBlank()) {
            throw new Exception("Programing language name is required");
        }
        if (programingLanguageRepository.existsByNameIgnoreCase(updateProgramingLanguageRequest.getName())) {
            throw new Exception("Programing language already exists");
        }
        programingLanguage.setName(updateProgramingLanguageRequest.getName());
        programingLanguageRepository.save(programingLanguage);
    }

    @Override
    public void delete(DeleteProgramingLanguageRequest deleteProgramingLanguageRequest) throws Exception {
        ProgramingLanguage programingLanguage = programingLanguageRepository.findById(deleteProgramingLanguageRequest.getId())
                .orElseThrow(() -> new Exception("Programing language not found"));
        programingLanguageRepository.delete(programingLanguage);
    }
}

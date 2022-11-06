package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.TechnologyService;
import kodlama.io.devs.business.requests.AddTechnologyRequest;
import kodlama.io.devs.business.requests.DeleteTechnologyRequest;
import kodlama.io.devs.business.requests.GetByIdTechnologyRequest;
import kodlama.io.devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.devs.business.responses.GetAllTechnologyResponse;
import kodlama.io.devs.business.responses.GetByIdTechnologyResponse;
import kodlama.io.devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.devs.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.devs.entities.concretes.ProgramingLanguage;
import kodlama.io.devs.entities.concretes.Technology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnologyManager implements TechnologyService {
    private TechnologyRepository technologyRepository;
    private ProgramingLanguageRepository programingLanguageRepository;

    public TechnologyManager(TechnologyRepository technologyRepository, ProgramingLanguageRepository programingLanguageRepository) {
        this.technologyRepository = technologyRepository;
        this.programingLanguageRepository = programingLanguageRepository;
    }

    @Override
    public List<GetAllTechnologyResponse> getAll() throws Exception {
        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologyResponse> responses = new ArrayList<GetAllTechnologyResponse>();
        if (technologies.isEmpty()) {
            throw new Exception("Technologies not found");
        }
        for (Technology technology : technologies) {
            GetAllTechnologyResponse responseItem = new GetAllTechnologyResponse();
            responseItem.setId(technology.getId());
            responseItem.setName(technology.getName());
            responseItem.setLanguageName(technology.getProgramingLanguage().getName());

            responses.add(responseItem);
        }
        return responses;
    }

    @Override
    public GetByIdTechnologyResponse getById(GetByIdTechnologyRequest getByIdTechnologyRequest) throws Exception {
        Technology technology = technologyRepository.findById(getByIdTechnologyRequest.getId())
                .orElseThrow(() -> new Exception("Technology not found"));

        GetByIdTechnologyResponse responseItem = new GetByIdTechnologyResponse();
        responseItem.setId(technology.getId());
        responseItem.setName(technology.getName());
        responseItem.setLanguageName(technology.getProgramingLanguage().getName());

        return responseItem;
    }

    @Override
    public void add(AddTechnologyRequest addTechnologyRequest) throws Exception {
        Technology technology = new Technology();
        technology.setName(addTechnologyRequest.getName());
        if (technology.getName().isEmpty() || technology.getName().isBlank()) {
            throw new Exception("Technology name is required");
        }
        if (technologyRepository.existsByNameIgnoreCase(addTechnologyRequest.getName())) {
            throw new Exception("Technology name already exists");
        }

        ProgramingLanguage programingLanguage = programingLanguageRepository.findById(addTechnologyRequest.getLanguageId())
                .orElseThrow(() -> new Exception("Programing language not found"));
        technology.setProgramingLanguage(programingLanguage);
        technologyRepository.save(technology);
    }

    @Override
    public void update(int id, UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
        Technology technology = technologyRepository.findById(id)
                .orElseThrow(() -> new Exception("Technology not found"));
        if (technology.getName().isEmpty() || technology.getName().isBlank()) {
            throw new Exception("Technology name is required");
        }
        if (technologyRepository.existsByNameIgnoreCase(updateTechnologyRequest.getName())) {
            throw new Exception("Technology name already exists");
        }

        technology.setName(updateTechnologyRequest.getName());
        technologyRepository.save(technology);
    }

    @Override
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
        Technology technology = technologyRepository.findById(deleteTechnologyRequest.getId())
                .orElseThrow(() -> new Exception("Technology not found"));
        technologyRepository.delete(technology);
    }
}

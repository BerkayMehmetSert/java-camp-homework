package kodlama.io.devs.api.controllers;

import kodlama.io.devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.devs.business.requests.AddProgramingLanguageRequest;
import kodlama.io.devs.business.requests.DeleteProgramingLanguageRequest;
import kodlama.io.devs.business.requests.GetByIdProgramingLanguageRequest;
import kodlama.io.devs.business.requests.UpdateProgramingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgramingLanguagesResponse;
import kodlama.io.devs.business.responses.GetByIdProgramingLanguageResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programingLanguages")
public class ProgramingLanguagesController {
    private ProgramingLanguageService programingLanguageService;

    public ProgramingLanguagesController(ProgramingLanguageService programingLanguageService) {
        this.programingLanguageService = programingLanguageService;
    }

    @GetMapping
    public List<GetAllProgramingLanguagesResponse> getAll() throws Exception {
        return programingLanguageService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdProgramingLanguageResponse getById(GetByIdProgramingLanguageRequest getByIdProgramingLanguageRequest) throws Exception {
        return programingLanguageService.getById(getByIdProgramingLanguageRequest);
    }

    @PostMapping
    public void add(AddProgramingLanguageRequest addProgramingLanguageRequest) throws Exception {
        programingLanguageService.add(addProgramingLanguageRequest);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody UpdateProgramingLanguageRequest updateProgramingLanguageRequest) throws Exception {
        programingLanguageService.update(id, updateProgramingLanguageRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(DeleteProgramingLanguageRequest deleteProgramingLanguageRequest) throws Exception {
        programingLanguageService.delete(deleteProgramingLanguageRequest);
    }
}

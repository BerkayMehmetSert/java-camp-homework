package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.devs.entities.concretes.ProgramingLanguage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/programingLanguages")
public class ProgramingLanguagesController {
    private ProgramingLanguageService programingLanguageService;

    public ProgramingLanguagesController(ProgramingLanguageService programingLanguageService) {
        this.programingLanguageService = programingLanguageService;
    }

    @GetMapping
    public List<ProgramingLanguage> getAll() throws Exception {
        return programingLanguageService.getAll();
    }

    @GetMapping("/{id}")
    public ProgramingLanguage getById(@PathVariable int id) throws Exception {
        return programingLanguageService.getById(id);
    }

    @PostMapping
    public void addLanguage(@RequestBody ProgramingLanguage language) throws Exception {
        programingLanguageService.addLanguage(language);
    }

    @PutMapping("/{id}")
    public void updateLanguage(@PathVariable int id, @RequestBody ProgramingLanguage language) throws Exception {
        programingLanguageService.updateLanguage(id, language);
    }

    @DeleteMapping("/{id}")
    public void deleteLanguage(@PathVariable int id) throws Exception {
        programingLanguageService.deleteLanguage(id);
    }
}

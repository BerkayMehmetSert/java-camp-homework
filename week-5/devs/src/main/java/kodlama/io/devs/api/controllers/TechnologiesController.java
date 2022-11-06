package kodlama.io.devs.api.controllers;

import kodlama.io.devs.business.abstracts.TechnologyService;
import kodlama.io.devs.business.requests.AddTechnologyRequest;
import kodlama.io.devs.business.requests.DeleteTechnologyRequest;
import kodlama.io.devs.business.requests.GetByIdTechnologyRequest;
import kodlama.io.devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.devs.business.responses.GetAllTechnologyResponse;
import kodlama.io.devs.business.responses.GetByIdTechnologyResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
    private TechnologyService technologyService;

    public TechnologiesController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping
    public List<GetAllTechnologyResponse> getAll() throws Exception {
        return technologyService.getAll();
    }

    @GetMapping("/{id}")
    public GetByIdTechnologyResponse getById(GetByIdTechnologyRequest getByIdTechnologyRequest) throws Exception {
        return technologyService.getById(getByIdTechnologyRequest);
    }

    @PostMapping
    public void add(AddTechnologyRequest addTechnologyRequest) throws Exception {
        technologyService.add(addTechnologyRequest);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
        technologyService.update(id, updateTechnologyRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
        technologyService.delete(deleteTechnologyRequest);
    }
}

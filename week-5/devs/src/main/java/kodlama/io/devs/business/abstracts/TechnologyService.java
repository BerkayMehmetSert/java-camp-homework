package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.requests.AddTechnologyRequest;
import kodlama.io.devs.business.requests.DeleteTechnologyRequest;
import kodlama.io.devs.business.requests.GetByIdTechnologyRequest;
import kodlama.io.devs.business.requests.UpdateTechnologyRequest;
import kodlama.io.devs.business.responses.GetAllTechnologyResponse;
import kodlama.io.devs.business.responses.GetByIdTechnologyResponse;

import java.util.List;

public interface TechnologyService {
    List<GetAllTechnologyResponse> getAll() throws Exception;

    GetByIdTechnologyResponse getById(GetByIdTechnologyRequest getByIdTechnologyRequest) throws Exception;

    void add(AddTechnologyRequest addTechnologyRequest) throws Exception;

    void update(int id, UpdateTechnologyRequest updateTechnologyRequest) throws Exception;

    void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception;
}

package springFramework.petClinic.services.map;

import org.springframework.stereotype.Service;
import springFramework.petClinic.model.Pet;
import springFramework.petClinic.services.PetService;

import java.util.Set;

/**
 * Created by ab on 12/13/18
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}

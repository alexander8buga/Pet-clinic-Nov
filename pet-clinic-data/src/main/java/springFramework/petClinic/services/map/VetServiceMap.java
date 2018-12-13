package springFramework.petClinic.services.map;

import org.springframework.stereotype.Service;
import springFramework.petClinic.model.Vet;
import springFramework.petClinic.services.VetService;

import java.util.Set;

/**
 * Created by ab on 12/13/18
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}

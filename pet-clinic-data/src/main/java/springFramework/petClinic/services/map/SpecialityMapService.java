package springFramework.petClinic.services.map;

import org.springframework.stereotype.Service;
import springFramework.petClinic.model.Specialty;
import springFramework.petClinic.services.SpecialtyService;

import java.util.Set;

/**
 * Created by ab on 12/13/18
 */
@Service
public class SpecialityMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {

    }

    @Override
    public void deleteById(Long id) {

    }
}

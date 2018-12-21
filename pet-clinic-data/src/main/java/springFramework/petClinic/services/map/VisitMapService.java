package springFramework.petClinic.services.map;


import org.springframework.stereotype.Service;
import springFramework.petClinic.model.Visit;
import springFramework.petClinic.services.VisitService;

import java.util.Set;

/**
 * Created by ab on 12/21/18
 */
@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getId() == null ||
        visit.getPet().getOwner() == null || visit.getPet().getOwner().getId() == null)
            throw new RuntimeException("Pet or Owner object doesnt exists");

        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {

    }

    @Override
    public void deleteById(Long id) {

    }
}

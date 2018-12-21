package springFramework.petClinic.services.springdatajpa;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springFramework.petClinic.model.Visit;
import springFramework.petClinic.repositories.VisitRepo;
import springFramework.petClinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ab on 12/13/18
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService  implements VisitService {
    private final VisitRepo visitRepo;

    public VisitSDJpaService(VisitRepo visitRepo) {
        this.visitRepo = visitRepo;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepo.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepo.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepo.save(visit);
    }

    @Override
    public void delete(Visit object) {
        visitRepo.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepo.deleteById(aLong);
    }
}

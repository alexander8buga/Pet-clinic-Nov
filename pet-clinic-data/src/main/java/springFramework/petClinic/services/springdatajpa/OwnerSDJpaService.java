package springFramework.petClinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springFramework.petClinic.model.Owner;
import springFramework.petClinic.repositories.OwnerRepo;
import springFramework.petClinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService  implements OwnerService {

    private final OwnerRepo ownerRepo;

    public OwnerSDJpaService(OwnerRepo ownerRepo) {
        this.ownerRepo = ownerRepo;
    }

    public Owner findByLastName(String lastName){
        return ownerRepo.findByLastName(lastName);

    }
    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepo.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
       return ownerRepo.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepo.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepo.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepo.deleteById(aLong);

    }
}

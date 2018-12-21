package springFramework.petClinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springFramework.petClinic.model.Owner;
import springFramework.petClinic.repositories.OwnerRepo;
import springFramework.petClinic.repositories.PetRepo;
import springFramework.petClinic.repositories.PetTypeRepo;
import springFramework.petClinic.repositories.VetRepo;
import springFramework.petClinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService  implements OwnerService {

    private final OwnerRepo ownerRepo;
    private final PetRepo petRepo;
    private final VetRepo vetRepo;
    private final PetTypeRepo petTypeRepo;

    public OwnerSDJpaService(OwnerRepo ownerRepo, PetRepo petRepo,
                             VetRepo vetRepo, PetTypeRepo petTypeRepo) {
        this.ownerRepo = ownerRepo;
        this.petRepo = petRepo;
        this.vetRepo = vetRepo;
        this.petTypeRepo = petTypeRepo;
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

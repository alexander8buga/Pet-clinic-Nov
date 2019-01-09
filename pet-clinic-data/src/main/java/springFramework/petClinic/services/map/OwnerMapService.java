package springFramework.petClinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springFramework.petClinic.model.Owner;
import springFramework.petClinic.model.Pet;
import springFramework.petClinic.services.OwnerService;
import springFramework.petClinic.services.PetService;
import springFramework.petClinic.services.PetTypeService;

import java.util.Set;

/**
 * Created by ab on 12/13/18
 */
@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {

        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));

                        }

                        if (pet.getId() == null) {
                            Pet savedPet = petService.save(pet);
                            pet.setId(savedPet.getId());
                        }
                    } else {
                        throw new RuntimeException("Pet is required to have type");
                    }

                });

            }
            return super.save(object);
        } else {
            return null;
        }

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
    
    //@Override
    public Owner findByLastName(String lastName){
        
        return this.findAll()
            .stream()
            .filter(owner -> owner.getLastName().equalsIgnoreCase(lastName))
            .findFirst()
            .orElse(null);
    }
}

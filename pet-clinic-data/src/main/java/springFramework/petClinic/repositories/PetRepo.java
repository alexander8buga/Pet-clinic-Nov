package springFramework.petClinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springFramework.petClinic.model.Pet;

/**
 * Created by ab on 12/21/2018
 */
public interface PetRepo extends CrudRepository<Pet, Long> {
}

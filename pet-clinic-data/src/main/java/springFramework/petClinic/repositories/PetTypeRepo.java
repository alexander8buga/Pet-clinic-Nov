package springFramework.petClinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springFramework.petClinic.model.PetType;

/**
 * Created by ab on 12/21/2018
 */
public interface PetTypeRepo extends CrudRepository<PetType, Long> {
}

package springFramework.petClinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springFramework.petClinic.model.Specialty;

/**
 * Created by ab on 12/21/2018
 */
public interface SpecialtyRepo extends CrudRepository<Specialty,Long> {
}

package springFramework.petClinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springFramework.petClinic.model.Vet;

/**
 * Created by ab on 12/21/2018
 */
public interface VetRepo extends CrudRepository<Vet, Long> {
}

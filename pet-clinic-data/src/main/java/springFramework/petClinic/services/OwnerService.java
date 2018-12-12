package springFramework.petClinic.services;

import springFramework.petClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}

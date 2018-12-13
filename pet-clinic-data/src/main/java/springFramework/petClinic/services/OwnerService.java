package springFramework.petClinic.services;

import springFramework.petClinic.model.Owner;

/**
 * Created by ab on 12/xx/18
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}

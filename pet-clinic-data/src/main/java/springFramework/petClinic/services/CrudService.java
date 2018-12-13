package springFramework.petClinic.services;

import java.util.Set;

/**
 * Created by ab on 12/xx/18
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}

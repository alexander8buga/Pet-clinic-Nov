package springFramework.petClinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Create by ab on 12/21/2018
 */
@Entity
@Table(name="vets")
public class Vet extends Person {

    // JPA loads all at ones when using eager
    @ManyToMany(fetch = FetchType.EAGER)
    // join table is a special table so the entities will have their own relationship
    //and DB will create a table that will define ids for relation btw entities
    @JoinTable(name="vet_specialties", joinColumns = @JoinColumn(name="vet_id"), inverseJoinColumns = @JoinColumn(name="specialty_id"))
    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}

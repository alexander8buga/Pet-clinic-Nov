package springFramework.petClinic.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by ab on 12/21/2018
 */
@Entity
@Table(name="visits")
public class Visit extends BaseEntity {

    @Column(name="local_data")
    private LocalDate localDate;

    @ManyToOne
    @JoinColumn(name="pet_id")
    private Pet pet;

    @Column(name="description")
    private String description;


    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package springFramework.petClinic.model;

import org.springframework.context.annotation.Description;

import java.time.LocalDate;

public class Visit extends BaseEntity {

    private LocalDate localDate;
    private Pet pet;
    private Description description;


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

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}

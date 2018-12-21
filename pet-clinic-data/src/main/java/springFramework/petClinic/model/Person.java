package springFramework.petClinic.model;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by ab on 12/21/2018
 */
//MappedSuperclass means the object is not going to be created in DB
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

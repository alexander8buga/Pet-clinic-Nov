package springFramework.petClinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ab on 12/21/2018
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="owners")
public class Owner extends Person {

    @Builder
    public Owner(Long id, String firstName, String lastName, String address,
                 String city, String cellphone, Set<Pet> pets) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.cellphone = cellphone;
        this.pets = pets;
    }

    @Column(name="address")
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="cellphone")
    private String cellphone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

}

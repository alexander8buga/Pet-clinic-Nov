package springFramework.petClinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by ab on 12/21/2018
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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

}

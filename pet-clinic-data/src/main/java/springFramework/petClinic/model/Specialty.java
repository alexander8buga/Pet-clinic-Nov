package springFramework.petClinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ab on 12/21/2018
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="specialties")
public class Specialty extends BaseEntity {

    @Column(name="description")
    private String description;

}

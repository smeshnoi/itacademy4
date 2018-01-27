package by.Itacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by user on 25.01.2018.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class EquipmentSet {
    @Column(name = "melee")
    private String melee;

    @Column(name = "distance")
    private String distance;
}

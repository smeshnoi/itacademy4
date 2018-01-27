package by.Itacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by user on 25.01.2018.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "heroes")
@Entity
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @AttributeOverrides(value = {
            @AttributeOverride(name = "melee", column = @Column(name = "set_one_melee")),
            @AttributeOverride(name = "distance", column = @Column(name = "set_one_distance"))
    })
    private EquipmentSet equipmentSet1;

    @AttributeOverrides(value = {
            @AttributeOverride(name = "melee", column = @Column(name = "set_two_melee")),
            @AttributeOverride(name = "distance", column = @Column(name = "set_two_distance"))
    })
    private EquipmentSet equipmentSet2;

    public Hero(String name, Gender gender, EquipmentSet equipmentSet1, EquipmentSet equipmentSet2) {
        this.name = name;
        this.gender = gender;
        this.equipmentSet1 = equipmentSet1;
        this.equipmentSet2 = equipmentSet2;
    }

    @Transient
    public boolean isHeroMale(Gender gender) {
        return gender == Gender.MALE ? true : false;
    }

    @Transient
    public boolean isHeroFemale(Gender gender) {
        return gender == Gender.FEMALE ? true : false;
    }
}

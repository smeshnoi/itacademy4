package by.Itacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.lang.annotation.Inherited;

/**
 * Created by user on 30.01.2018.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "armored")
//@PrimaryKeyJoinColumn(name = "enemy_id")
@DiscriminatorValue("armor")
public class ArmoredEnemy extends Enemy {

    @Enumerated(EnumType.STRING)
    @Column(name = "armorType")
    private ArmorType armorType;

    @Column(name = "armorDurability")
    private int armorDurability;
}

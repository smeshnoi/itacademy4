package by.Itacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by user on 30.01.2018.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ranged")
//@PrimaryKeyJoinColumn(name = "enemy_id")
@DiscriminatorValue("range")
public class RangedEnemy extends Enemy {

    @Enumerated(EnumType.STRING)
    @Column(name = "weaponType")
    private WeaponType weaponType;

    @Column(name = "rangeOfFire")
    private int rangeOfFire;
}

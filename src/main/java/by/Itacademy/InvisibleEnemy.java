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
@Table(name = "invisible")
//@PrimaryKeyJoinColumn(name = "enemy_id")
@DiscriminatorValue("invisibility")
public class InvisibleEnemy extends Enemy {

    @Column(name = "invisibilityDuration")
    private int invisibilityDuration;
}

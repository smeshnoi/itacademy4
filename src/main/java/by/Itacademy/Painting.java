package by.Itacademy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by user on 23.01.2018.
 */
@Entity
@Table(name = "paints")
@Getter
@Setter
@NoArgsConstructor

public class Painting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "authorName")
    private String authorName;

    @Enumerated(EnumType.STRING)
    @Column(name = "rarity")
    private Rarity rarity;

    public Painting(String name, String authorName, Rarity rarity) {
        this.name = name;
        this.authorName = authorName;
        this.rarity = rarity;
    }
}

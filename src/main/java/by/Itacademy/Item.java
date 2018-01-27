package by.Itacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by user on 27.01.2018.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item")
    private String nameItem;

    @ManyToOne
    @JoinColumn(name = "id")
    private Inventory inventory;

    public Item(String nameItem, Inventory inventory) {
        this.nameItem = nameItem;
        this.inventory = inventory;
    }
}

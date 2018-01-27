package by.Itacademy;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Admin on 18.01.2018.
 */
@Entity
@Table(name = "messages")
@Getter
@Setter
@NoArgsConstructor

public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "text")
    private String text;

    public Message(String text) {
        this.text = text;
    }

}

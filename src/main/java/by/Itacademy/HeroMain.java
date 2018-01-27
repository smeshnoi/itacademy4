package by.Itacademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by user on 25.01.2018.
 */
public class HeroMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Hero hero = new Hero("Thief", Gender.MALE,
                new EquipmentSet("knife", "bow"),
                new EquipmentSet("sword", "big bow"));
        session.save(hero);
        transaction.commit();
        session.close();
    }
}

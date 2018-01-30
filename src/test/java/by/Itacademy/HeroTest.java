package by.Itacademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Created by user on 25.01.2018.
 */
public class HeroTest {
    private static final SessionFactory SESSION_FACTORY
            = new Configuration().configure().buildSessionFactory();
    @Test
    public void testSaveToDb() {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();
//        Hero hero = new Hero("Thief", Gender.MALE,
//                new EquipmentSet("knife", "bow"),
//                new EquipmentSet("sword", "big bow"));
//        session.save(hero);
//        Hero hero1 = session.get(Hero.class, 1l);
//        System.out.println(hero1.isHeroMale(hero1.getGender()));
//        System.out.println(hero1.isHeroFemale(hero1.getGender()));
        //Inventory inventory = new Inventory("set1");
        //session.save(inventory);

        //Item item = new Item("sword", inventory);
        //Item item2 = new Item("knife", inventory);
        //session.save(item);
        //session.save(item2);
        transaction.commit();
        session.close();
    }
}

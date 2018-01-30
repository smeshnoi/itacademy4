package by.Itacademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.junit.internal.runners.model.EachTestNotifier;

/**
 * Created by user on 30.01.2018.
 */
public class EnemyTest {
    private static final SessionFactory SESSION_FACTORY
            = new Configuration().configure().buildSessionFactory();

    @Test
    public void testSaveToDb() {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

        ArmoredEnemy armoredEnemy = new ArmoredEnemy(ArmorType.Clothes, 20);
        session.save(armoredEnemy);
        RangedEnemy rangedEnemy = new RangedEnemy(WeaponType.Melee, 40);
        session.save(rangedEnemy);
        InvisibleEnemy invisibleEnemy = new InvisibleEnemy(10);
        session.save(invisibleEnemy);

        //session.createQuery("select e from Enemy e", Enemy.class).list().forEach(System.out::println);

        transaction.commit();
        session.close();
    }
}

package by.Itacademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.Test;

/**
 * Created by user on 23.01.2018.
 */
public class PaintingTest {
    private static final SessionFactory SESSION_FACTORY
            = new Configuration().configure().buildSessionFactory();
    @Test
    public void testSaveToDb() {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();
        Painting painting = new Painting("test", "author1", Rarity.RARE);
        session.save(painting);
        Painting painting1 = session.get(Painting.class, 1);
        transaction.commit();
        session.close();
    }

    @Test
    public void testLoadToDb() {
        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();
        Painting painting = new Painting("test", "author1", Rarity.NOTRARE);
        session.save(painting);
        //Painting painting1 = session.get(Painting.class, 1);
        //Painting painting1 = session.load(Painting.class,1);
        session.evict(painting);
        painting.setAuthorName("Jhon");
        //session.merge(painting);
        session.save(painting);
        Painting painting2 = session.get(Painting.class, 1);
        Painting painting3 = session.get(Painting.class, 2);

        transaction.commit();
        session.close();
    }

    @AfterClass
    public static void finish() {
        SESSION_FACTORY.close();
    }
}

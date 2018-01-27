package by.Itacademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private static final SessionFactory SESSION_FACTORY
            = new Configuration().configure().buildSessionFactory();
    @Test
    public void testSaveToDb() {
        Session session = SESSION_FACTORY.openSession();

        Message message = new Message("test");
        session.save(message);
        Message message1 = session.find(Message.class, 1);
        //System.out.printf(String.valueOf(message1.getText()));
        session.close();
    }

    @AfterClass
    public static void finish() {
        SESSION_FACTORY.close();
    }
}

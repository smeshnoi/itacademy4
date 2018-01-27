package by.Itacademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Created by user on 23.01.2018.
 */
public class PaintMain {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //Painting painting = new Painting("paint2", "author2", Rarity.NOTRARE);
        //session.save(painting);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}

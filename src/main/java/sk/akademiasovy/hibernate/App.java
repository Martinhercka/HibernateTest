package sk.akademiasovy.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import sk.akademiasovy.hibernate.entity.Cars;
import sk.akademiasovy.hibernate.entity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        System.out.println( "Hello World!" );
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        User userNew= new User();
        User user=session.load(User.class,4L);
        user.setFirstName("Mtin");
        userNew.setFirstName("Jozko");
        userNew.setLastName("Mrkva");


        session.save(user);
        session.save(userNew);
        session.update(user);
        tx.commit();

        Cars BMW = new Cars();
        BMW.setBrand("BMW X6");
        BMW.setEngine(2.5);
        session.save(BMW);
        session.getTransaction().commit();


        User user2 = (User)session.get(User.class, 1L);
        // Hibernate.initialize(user2);
        if(user2!=null){
            System.out.println(user2.getLastName());
        }
        session.close();
    }
}

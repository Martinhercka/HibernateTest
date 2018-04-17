package sk.akademiasovy.hibernate;

import org.hibernate.Session;
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

        Session session= HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        User user=new User();
        user.setFirstName("Matej");
        user.setLastName("Novak");
        session.save(user);
        session.getTransaction().commit();
        //session.close();
        System.out.println("new id: "+user.getId());

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

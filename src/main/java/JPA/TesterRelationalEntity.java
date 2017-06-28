package JPA;

import JPA.entity.Address;
import JPA.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Rohith on 6/28/2017.
 */
public class TesterRelationalEntity {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManger=entityManagerFactory.createEntityManager();
          //INSERT
//        User user= new User();
//
//        user.setEmail("rohith@123.com");
//        user.setFirstName("roh");
//        user.setLastName("sag");
//
//        Address address=new Address();
//        address.setCity("chicago");
//        address.setState("IL");
//        address.setStreet("Main street");
//
//        user.setAddress(address);
//        entityManger.getTransaction().begin();
//        entityManger.persist(address);
//        entityManger.persist(user);
//        entityManger.getTransaction().commit();

        //FIND
//          User user=entityManger.find(User.class,"440802ed-e9d4-48e5-b8fa-864e99fe612c");
//          System.out.println(user);

        entityManger.close();
        entityManagerFactory.close();

    }
}

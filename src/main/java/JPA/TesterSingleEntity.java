package JPA;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Rohith on 6/25/2017.
 */
public class TesterSingleEntity {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("jpa-example");

        EntityManager entityManager=entityManagerFactory.createEntityManager();
        //INSERT
//        Employee emp=new Employee();
//        emp.setEmail("r23@1.com");
//        emp.setFirstName("Rohith");
//        emp.setLastName("Sagar");
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(emp);
//        entityManager.getTransaction().commit();
//
//        entityManager.close();

        //FIND BY ID
//         Employee emp=entityManager.find(Employee.class, "af03adcd-2de5-4fd3-8668-13a9b714bfa3");
//          System.out.println(emp);
        //UPDATE
//        Employee emp=entityManager.find(Employee.class, "af03adcd-2de5-4fd3-8668-13a9b714bfa3");
//        emp.setFirstName("Sagar");
//        entityManager.getTransaction().begin();
//        entityManager.merge(emp);
//        entityManager.getTransaction().commit();
//        entityManager.close();
        //DELETE
//        Employee emp=entityManager.find(Employee.class, "af03adcd-2de5-4fd3-8668-13a9b714bfa3");
//        entityManager.getTransaction().begin();
//        entityManager.remove(emp);
//        entityManager.getTransaction().commit();

        //FINDALL
//        TypedQuery<Employee> query = entityManager.createQuery("SELECT emp FROM Employee emp ORDER BY emp.email DESC", Employee.class);
//
//        List<Employee> resultList=query.getResultList();
//        for (Employee emp:resultList){
//            System.out.println(emp);
//        }
        // FINDALL USING NATIVE SQL
//        Query query = entityManager.createNativeQuery("SELECT * FROM Employee", Employee.class);
//        List<Employee> resultList=query.getResultList();
//        for (Employee emp:resultList){
//            System.out.println(emp);
//        }

        // FIND BY EMAIL using TypedQuery
//        TypedQuery<Employee> query = entityManager.createQuery("SELECT emp FROM Employee emp WHERE emp.email=:paramEmail", Employee.class);
//        query.setParameter("paramEmail", "r23@1.com");
//        List<Employee> resultList=query.getResultList();
//        for (Employee emp:resultList){
//            System.out.println(emp);
//        }
        //Find By Email using named queries (Where clause)
//        TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findKByEmail", Employee.class);
//        query.setParameter("paramEmail", "r23@1.com");
//        List<Employee> resultList=query.getResultList();
//        for (Employee emp:resultList){
//            System.out.println(emp);
//        }


        entityManagerFactory.close();
    }
}

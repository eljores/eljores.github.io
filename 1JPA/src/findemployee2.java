import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class findemployee2 {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("1JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		
//Between
		Query query = (Query) entitymanager.createQuery("Select e " + "from Employee e " + "where e.salary " + "Between 3 and 40000");
		List<Employee> list=(List<Employee>)query.getResultList( );
		for (Employee e : list) {
			System.out.print("Employee ID :" + e.getEid());
			System.out.println("\t Employee salary :" + e.getSalary());
		}
		
//Like
		Query query1 = entitymanager.createQuery("Select e " + "from Employee e " + "where e.ename LIKE 'J%'");
		List<Employee> list1=(List<Employee>)query1.getResultList( );
		for (Employee e : list1) {
			System.out.print("Employee ID :" + e.getEid());
			System.out.println("\t Employee name :" + e.getEname());
		}
	}
}

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class updateemployee {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("1JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		Employee employee = entitymanager.find(Employee.class, 2);
		// before update
		System.out.println(employee);
		employee.setSalary(12);
		entitymanager.getTransaction().commit();
		// after update
		System.out.println(employee);
		entitymanager.close();
		emfactory.close();
	}
}

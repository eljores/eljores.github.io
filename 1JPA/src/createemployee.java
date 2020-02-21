import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class createemployee {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("1JPA");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		
		Employee hola = new Employee(2, "Jordi2", 1501, "Programador");
		

		entitymanager.persist(hola); 
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}
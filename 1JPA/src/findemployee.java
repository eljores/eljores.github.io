import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class findemployee {
	public static void main( String[ ] args ) 
	{
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "1JPA" );
	EntityManager entitymanager = emfactory.
	createEntityManager();
	
	Employee employee = entitymanager.
	find( Employee.class, 1 );
	System.out.println("employee ID = "+employee.getEid( ));
	System.out.println("employee NAME = "+employee.getEname( ));
	System.out.println("employee SALARY = "+employee.getSalary( ));
	System.out.println("employee DESIGNATION = "+employee.getDeg( ));
	}
	}

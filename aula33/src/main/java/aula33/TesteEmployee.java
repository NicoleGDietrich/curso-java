package aula33;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

public class TesteEmployee {
	
public static void main(String[] args) {
	
	EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	entityManager.getTransaction().begin();
	//Employee e1 = new Employee (null, "Joao", "2600");
	//entityManager.persist(e1);
	
	System.out.println("Select all - JPQL:");
	Query query = entityManager.createQuery("from Employee e");
	List<Employee> lista = query.getResultList();
	for (Employee employee : lista) {
		System.out.println(employee);
	}
	
	System.out.println("Select all - Criteria:");
	
	CriteriaBuilder cb = entityManager.getCriteriaBuilder();
	CriteriaQuery<Employee> q = cb.createQuery(Employee.class);
	Root<Employee> e = q.from(Employee.class);
	q.select(e);
	for (Employee employee : lista) {
		System.out.println(employee);
	}

	System.out.println("Select coluna - JPQL:");
	      Query query2 = entityManager.createQuery("SELECT nome FROM Employee");
		  List<String> results = query2.getResultList();
		  for (String string : results) {
		      System.out.println(string);
		  }
	
		  System.out.println("Select coluna - Criteria:");
		  CriteriaQuery<String> q4= cb.createQuery(String.class);
		  Root<Employee> c = q4.from(Employee.class);
		  q4.select(c.get("nome"));
		  List<String> results4 =entityManager.createQuery(q4).getResultList();
		  for (String objects : results4) {
			  System.out.println(objects);
		  }

	      
	
	entityManager.getTransaction().commit();
	entityManager.close();
	
	
	JPAUtil.shutdown();
	System.exit(0);
	
}

}

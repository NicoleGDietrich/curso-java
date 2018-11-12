package aula33;

import javax.persistence.EntityManager;

public class Testes {
	
	public static void main(String[] args) {
		
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		//Endereco end = new Endereco(null, "Rua teste3", "1003");
		//Funcionario func = new Funcionario(null, "Funcionario 03", end);
		//entityManager.persist(end);
		//entityManager.persist(func);
		//Funcionario funcionario = entityManager.find(Funcionario.class, 2);
		//System.out.println(funcionario.getId());
		//System.out.println(funcionario.getNome());
		//System.out.println("Mostrar dados do endereço");
		//entityManager.getTransaction().commit();
		//entityManager.close();
		//System.out.println(funcionario.getIdEndereco().getRua());
	
		
		
		
		JPAUtil.shutdown();
		System.exit(0);
		
	}
}

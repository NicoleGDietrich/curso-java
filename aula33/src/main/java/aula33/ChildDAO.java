package aula33;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ChildDAO implements ChildRepositorio{

	@Override
	public List<Child> listarTodos() {
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		TypedQuery<Child> query = em.createQuery("from Child", Child.class);
		List<Child> lista = query.getResultList();
		em.close();
		return lista;
	}

	@Override
	public Child buscarPorId(Integer id) {
		Child child;
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		child = em.find(Child.class, id);
		em.close();
		return child;
	}

	@Override
	public boolean incluir(Child child) {
		boolean resultado = false;
		if(child != null && child.getId() == null){
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(child);
			em.getTransaction().commit();
			em.close();
			resultado = child.getId() != null;
		}
		return resultado;
	}

	@Override
	public boolean atualizar(Child child) {
		boolean resultado = false;
		if(child != null && child.getId() != null){
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			try{
			em.getTransaction().begin();
			em.merge(child);
			em.getTransaction().commit();
			em.close();
			resultado = true;
			}catch(Exception e){
				if(em != null && em.isOpen()){
					em.getTransaction().rollback();
				}
			}
		}
		return resultado;
	}

	@Override
	public boolean remover(Child child) {
		boolean resultado = false;
		if(child != null && child.getId() != null){
			EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
			try{
			em.getTransaction().begin();
			child = em.merge(child);
			em.remove(child);
			em.getTransaction().commit();
			em.close();
			resultado = true;
			}catch(Exception e){
				if(em != null && em.isOpen()){
					em.getTransaction().rollback();
				}
			}
		}
		return resultado;
	}
	
	

}

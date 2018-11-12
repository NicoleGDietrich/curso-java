package aula32;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;




public class ProdutoDAO implements RepositorioProduto{

	public List<Produto> buscarTodos() {
		EntityManager em = Main.getEntityManagerFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Produtos", Produto.class);
		List<Produto> lista = query.getResultList();
		em.close();
		return lista;
	}
	
	private Produto carregarProduto(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		Double preco = cursor.getDouble("preco");
		return new Produto (id,nome, preco);
	}


	public List<Produto> buscarPorNome(String nome) {
		EntityManager em = Main.getEntityManagerFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Produtos p where upper(p.nome) like upper(:nome)", Produto.class);
		query.setParameter("nome", "%"+nome+"%");
		List<Produto> lista = query.getResultList();
		em.close();
		return lista;
	}

	

	public List<Produto> buscarPorPreco(double minimo, double maximo) {
		EntityManager em = Main.getEntityManagerFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("\"select * from Produtos where preco < ? AND preco > ? \"", Produto.class);
		query.setParameter(1, minimo);
		query.setParameter(2, maximo);
		List<Produto> lista = query.getResultList();
		em.close();
		return lista;
	}

	

	public Produto buscarPorId(Integer id) {
		Produto produto;
		EntityManager em = Main.getEntityManagerFactory().createEntityManager();
		produto = em.find(Produto.class, id);
		em.close();
		return produto;
	}
	
	public void inserir(Produto produto) {
		
		if(produto != null && produto.getId() == null){
			EntityManager em = Main.getEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(produto);
			em.getTransaction().commit();
			em.close();
			produto.getId();
		}
	}

	public void atualizar(Produto produto) {
		
		if(produto != null && produto.getId() != null){
			EntityManager em = Main.getEntityManagerFactory().createEntityManager();
			try{
			em.getTransaction().begin();
			em.merge(produto);
			em.getTransaction().commit();
			em.close();
			}catch(Exception e){
				if(em != null && em.isOpen()){
					em.getTransaction().rollback();
				}
			}
		}
	}

	public void remover(Integer id) {
		
			EntityManager em = Main.getEntityManagerFactory().createEntityManager();
			em.remove(id);
			em.close();
			
		
	}

	public int contar() {
		
		EntityManager em = Main.getEntityManagerFactory().createEntityManager();
		
	}

}
	
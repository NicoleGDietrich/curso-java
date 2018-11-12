package aula33;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

public class TesteTarefa {
	
	
	public static void main(String[] args) {
		
	
	EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	entityManager.getTransaction().begin();
	Tarefa t1 = new Tarefa(null, "tarefa do BONZAO", StatusTarefa.NOVA, new Date(), new Date());
	Usuario u = new Usuario (null,"Tibúrcio Adm", "tibadm@teste.com", Arrays.asList(t1));
	t1.setUsuario(u);
	Set<PerfilUsuario> perfis = new HashSet<>();
	perfis.add(PerfilUsuario.BAGRINHO);
	perfis.add(PerfilUsuario.MANAGER);
	perfis.add(PerfilUsuario.ADMIN);
	u.setPerfis(perfis);
	entityManager.persist(u);
	//Tarefa tarefa = new Tarefa();
	//tarefa.setTitulo("Minha primeira Tarefa");
	//tarefa.setStatus(StatusTarefa.NOVA);
	//tarefa.setCriadoEm (new Date());
	//tarefa.setAtualizadoEm(new Date());
	//entityManager.persist(tarefa);
	
	entityManager.getTransaction().commit();
	entityManager.close();
	
	JPAUtil.shutdown();
	System.exit(0);
	
	
	}
}

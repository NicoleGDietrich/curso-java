package br.com.java.aula24;

import org.junit.Assert;
import org.junit.Test;



public class TesteContato {

	
	@Test
	public void testAdicionar() {
		RepositorioContato repositorio = new RepositorioContatoMemory();
		int quantidade = repositorio.buscarTodos().size();
		Assert.assertEquals(0, quantidade);
		
		repositorio.adicionar(new Contato(null, "Contato1", "contato1@teste.com", "33221100", TipoContato.AMIGO));
		quantidade = repositorio.buscarTodos().size();
		Assert.assertEquals(1,quantidade);
		
	}
	
	@Test
	public void testAdicionar2() {
		RepositorioContato repositorio = new RepositorioContatoMemory();
		int quantidade = repositorio.buscarTodos().size();
		Assert.assertEquals(0, quantidade);
		repositorio.adicionar(new Contato(null, "Contato1", "contato1@teste.com", "33221100", TipoContato.AMIGO));
		quantidade = repositorio.buscarTodos().size();
		Assert.assertTrue(repositorio.buscarTodos().get(0).getId()!=null);
		
	}
	@Test
	public void testEditar() {
		RepositorioContato repositorio = new RepositorioContatoMemory();
		repositorio.adicionar(new Contato(null, "Contato1", "contato1@teste.com", "33221100", TipoContato.AMIGO));
		Integer id = repositorio.buscarTodos().get(0).getId();
		Contato contato = new Contato (id,"NomeAlterado", "", "",TipoContato.FAMILIA);
		repositorio.editar(contato);
		Contato alterado = repositorio.buscarTodos().get(0);
		Assert.assertEquals(contato.getId(), alterado.getId());
		Assert.assertEquals(contato.getNome(), alterado.getNome());
		Assert.assertEquals(contato.getEmail(), alterado.getEmail());
		
		
	}
	
}

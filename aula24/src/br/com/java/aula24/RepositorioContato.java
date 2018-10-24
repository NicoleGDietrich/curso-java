package br.com.java.aula24;
import java.util.List;

public interface RepositorioContato {
	
	
	 boolean adicionar (Contato contato);
	 boolean editar (Contato contato);
	 List <Contato> buscarTodos();
	 List<Contato> buscarPorNome(String nome);
	 List<Contato> buscarPorTelefone(String telefone);
	 List<Contato> buscarPorTipo(TipoContato tipo);
	 Contato buscarPorId(Integer id);
	 boolean remover (Contato contato);


	 

}

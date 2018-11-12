package aula33;

import java.util.List;

public interface ChildRepositorio {
	
	public List <Child> listarTodos();
	public Child buscarPorId(Integer id);
	public boolean incluir (Child child);
	public boolean atualizar (Child child);
	public boolean remover (Child child);


}

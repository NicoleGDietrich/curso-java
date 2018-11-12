package aula33;

import java.util.List;


public class TesteChild {
	
	public static void main(String[] args) {
	
	ChildDAO dao = new ChildDAO();
	Owner owner = new Owner (1, "Teste5");
	Child child = new Child (1, "Teste05", owner);
	dao.atualizar(child);
	
	//child = dao.buscarPorId(2);
	//System.out.println(child);
	//List<Child> lista = dao.listarTodos();
	//for (Child childs: lista) {
		//System.out.println(lista);
		
	
	
	
	
	
	}
}

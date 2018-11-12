package aula31;

import java.util.List;

public class ContatoDAOTest {

	public static void main(String[] args) {

		Contato c1 = new Contato(1, "João da Silva", "joao@teste.com", "33221100");
		//Contato c2 = new Contato(null, "Maria", "maria@teste.com", "55443322");
		ContatoDAO dao = new ContatoDAO();
		dao.atualizar(c1);
		//dao.inserir(c2);

		List<Contato> lista = dao.buscarTodos();

		for (Contato contato : lista) {
			System.out.println(contato);
		}
		lista = dao.buscarPorNome("jo");
		for(Contato contato : lista) {
			System.out.println(contato);
		}
	}
}

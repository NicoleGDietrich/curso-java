package aula30;

import java.util.ArrayList;

public class ProdutoController {
	
	private ProdutoDAO ProdutoDAO = new ProdutoDAO();
	
	public void adicionarProduto(String nome, Double preco) {
	Produto produto = new Produto();
	produto.setNome(nome);
	produto.setPreco(preco);
	ProdutoDAO.inserir(produto);
}
	
	
	public boolean isNomeValido(String nome) {
		boolean valido = nome !=null && !"".equals(nome.trim()) && nome.length() <=200;
		return valido;
	}
	
	public boolean isPrecoValido(Double preco) {
		boolean valido = preco !=null && preco > 0.01;
		return valido;
	}
	
	public boolean isIdValido(Integer id) {
		boolean resultado = false;
		Produto valido = ProdutoDAO.buscarPorId(id);
		if(valido != null){
			resultado = true;
		}
		return resultado;
}


	public ArrayList<Produto> buscarTodos() {
		
		return (ArrayList<Produto>) ProdutoDAO.buscarTodos();
	}

	public ArrayList<Produto> buscarPorNome(String nome) {
		ArrayList<Produto> lista = (ArrayList<Produto>) ProdutoDAO.buscarPorNome(nome);
		return (ArrayList<Produto>) lista;

	}
		public ArrayList<Produto> buscarPorPreco(Double minimo, Double maximo) {
			ArrayList<Produto> lista = (ArrayList<Produto>) ProdutoDAO.buscarPorPreco(minimo,maximo);
			return (ArrayList<Produto>) lista;
}
	
	public boolean removerProduto(int id) {
		boolean resultado = false;
        ProdutoDAO.remover(id);
	    Produto valido =  ProdutoDAO.buscarPorId(id);
	        if (valido == null){
		       resultado = true;
	}
	    return resultado;
}
	public void atualizarProduto(Integer id, String nome, Double preco) {
		Produto produto = new Produto();
		produto.setId(id);
		produto.setNome(nome);
		produto.setPreco(preco);
		ProdutoDAO.atualizar(produto);
}
	
}

package aula30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class ProdutoDAO implements RepositorioProduto{

	@Override
	public List<Produto> buscarTodos() {
		List <Produto> produtos = new ArrayList<>();
		try {
			Connection conexao = Main.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from Produtos");
			ResultSet cursor = comando.executeQuery();
			while(cursor.next()) {
				produtos.add(carregarProduto(cursor));
			}
			cursor.close();
			comando.close();
		}catch (SQLException e) {
			System.out.println("Não foi possível carregar a lista de produtos");
		}
		
	
		return produtos;
	}
	private Produto carregarProduto(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		Double preco = cursor.getDouble("preco");
		return new Produto (id,nome, preco);
	}

	@Override
	public List<Produto> buscarPorNome(String nome) {
		List <Produto> produtos = new ArrayList<>();
		try {
			Connection conexao = Main.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from Produtos where upper(nome) like upper (?)");
			comando.setString(1, "%" + nome + "%");
			ResultSet cursor = comando.executeQuery();
			while(cursor.next()) {
				produtos.add(carregarProduto(cursor));
			}
			cursor.close();
			comando.close();
		}catch (SQLException e) {
			System.out.println("Não foi possível carregar a lista de produtos por nome");
		}
		return produtos;
	}

	@Override
	public List<Produto> buscarPorPreco(double minimo, double maximo) {
		List <Produto> produtos = new ArrayList<>();
		try {
			Connection conexao = Main.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from Produtos where preco < ? AND preco > ? ");
			comando.setDouble(1, minimo);
			comando.setDouble(2, maximo);
			ResultSet cursor = comando.executeQuery();
			while(cursor.next()) {
				produtos.add(carregarProduto(cursor));
			}
			cursor.close();
			comando.close();
		}catch (SQLException e) {
			System.out.println("Não foi possível buscar os produtos por preço");
		}
		return produtos;
	}



	@Override
	public Produto buscarPorId(Integer id) {
		Produto produto = null;
		if (id!= null) {
		try {
			Connection conexao = Main.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from Produtos where id = ?");
			comando.setInt(1,id);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()) {
				produto = carregarProduto(cursor);
			}
			cursor.close();
			comando.close();
			
		} catch (SQLException e) {
			System.out.println("Não foi possível  carregar o produto solicitado");
			
		}
	}
	return produto;
}

	@Override
	public void inserir(Produto produto) {
		if(produto != null) {
			try {
				Connection conexao = Main.getConnection();
				PreparedStatement comando = conexao.prepareStatement("insert into Produtos(nome, preco) values (?,?)", Statement.RETURN_GENERATED_KEYS);
				comando.setString(1, produto.getNome());
				comando.setDouble(2, produto.getPreco());
				comando.execute();
				ResultSet cursor = comando.getGeneratedKeys();
				if(cursor.next()) {
					Integer id = cursor.getInt("id");
					produto.setId(id);
				}
				cursor.close();
				comando.close();
			} catch (SQLException e) {
				e.printStackTrace();
			System.out.println("Não foi possível inserir os dados do produto");
			}
		}
		
	}

	@Override
	public void atualizar(Produto produto) {
		if(produto != null && produto.getId() != null) {
			try {
				Connection conexao = Main.getConnection();
				PreparedStatement comando = conexao.prepareStatement("update Produtos set nome = ? where preco = ?");
				comando.setString(1, produto.getNome());
				comando.setDouble(2, produto.getPreco());
				comando.executeUpdate();
				comando.close();
			}catch (SQLException e) {
				System.out.println("Não foi possível atualizar os dados do produto");
			}
		}
	}
		

	@Override
	public void remover(Integer id) {
		if(id != null)
			try {
				Connection conexao = Main.getConnection();
				PreparedStatement comando = conexao.prepareStatement("delete from Produtos where id = ?");
				comando.setInt(1, id);
				comando.execute();
				comando.close();
			}catch (SQLException e) {
				System.out.println("Não foi possível remover os dados da produto");
			}
		}
		

	@Override
	public int contar() {
		int quantidade = 0;
		try {
			Connection conexao = Main.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select count (*) as quantidade from Produtos ");
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()) {
				quantidade = cursor.getInt("quantidade");
			}
			cursor.close();
			comando.close();
		}catch  (SQLException e) {
			System.out.println("Não foi possível contar a quantidade de produtos");
			
		}
		return quantidade;
	
		
	}

}

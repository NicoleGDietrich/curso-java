package br.com.javaaula29;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO  implements RepositorioContato{

	@Override
	public List<Contato> buscarTodos() {
		List <Contato> contatos = new ArrayList<>();
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from contatos1");
			ResultSet cursor = comando.executeQuery();
			while(cursor.next()) {
				contatos.add(carregarContato(cursor));
			}
			cursor.close();
			comando.close();
		}catch (SQLException e) {
			System.out.println("Não possível carregar a lista de contatos");
		}
		return contatos;
	}
	private Contato carregarContato(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String email = cursor.getString("email");
		String telefone = cursor.getString("telefone");
		return new Contato (id,nome, email, telefone);
	}
	

	@Override
	public List<Contato> buscarPorNome(String nome) {
		List <Contato> contatos = new ArrayList<>();
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from contatos1 where upper(nome) like upper (?)");
			comando.setString(1, "%" + nome + "%");
			ResultSet cursor = comando.executeQuery();
			while(cursor.next()) {
				contatos.add(carregarContato(cursor));
			}
			cursor.close();
			comando.close();
		}catch (SQLException e) {
			System.out.println("Não possível carregar a lista de contatos por nome");
		}
		return contatos;
	}

	@Override
	public Contato buscarPorTelefone(String telefone) {
		Contato contato = null;
		if (telefone!= null) {
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from contatos1 where telefone = ?");
			comando.setString(1,telefone);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()) {
				contato = carregarContato(cursor);
			}
			cursor.close();
			comando.close();
			
		} catch (SQLException e) {
			System.out.println("Não foi possível  carregar o contato por telefone");
			
		}
	}
	return contato;
	}

	@Override
	public Contato buscarPorId(Integer id) {
		Contato contato = null;
		if (id!= null) {
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from contatos1 where id = ?");
			comando.setInt(1,id);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()) {
				contato = carregarContato(cursor);
			}
			cursor.close();
			comando.close();
			
		} catch (SQLException e) {
			System.out.println("Não foi possível  carregar o contato por id");
			
		}
	}
	return contato;
	}

	@Override
	public void inserir(Contato contato) {
		if(contato != null) {
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("insert into contatos1(nome, email, telefone) values (?)(?) (?)", Statement.RETURN_GENERATED_KEYS);
				comando.setString(1, contato.getNome());
				comando.setString(2, contato.getEmail());
				comando.setString(3, contato.getTelefone());
				comando.execute();
				ResultSet cursor = comando.getGeneratedKeys();
				if(cursor.next()) {
					Integer id = cursor.getInt("id");
					contato.setId(id);
				}
				cursor.close();
				comando.close();
			} catch (SQLException e) {
				e.printStackTrace();
			System.out.println("Não foi possível inserir os dados do contato");
			}
		}
		
	}

	@Override
	public void atualizar(Contato contato) {
		if(contato != null && contato.getId() != null) {
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("update contatos1 set nome = ? where email = ? where telefone = ? ");
				comando.setString(1, contato.getNome());
				comando.setString(2, contato.getEmail());
				comando.setString(3, contato.getTelefone());
				comando.executeUpdate();
				comando.close();
			}catch (SQLException e) {
				System.out.println("Não foi possível atualizar os dados do contato");
			}
		}
	}
		
	

	@Override
	public void remover(Integer id) {
		if(id != null)
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("delete from contatos1 where id = ?");
				comando.setInt(1, id);
				comando.execute();
				comando.close();
			}catch (SQLException e) {
				System.out.println("Não foi possível remover os dados da pessoa");
			}
		}
		
	

	@Override
	public int contar() {
		int quantidade = 0;
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select count (*) as quantidade from contatos1");
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()) {
				quantidade = cursor.getInt("quantidade");
			}
			cursor.close();
			comando.close();
		}catch  (SQLException e) {
			System.out.println("Não foi possível contar a quantidade de contatos");
			
		}
		return quantidade;
	
		
	}

}

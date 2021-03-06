package br.com.javaaula29;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
	
	public List<Pessoa> buscarTodos(){
		List <Pessoa> pessoas = new ArrayList<>();
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from pessoas");
			ResultSet cursor = comando.executeQuery();
			while(cursor.next()) {
				pessoas.add(carregarPessoa(cursor));
			}
			cursor.close();
			comando.close();
		}catch (SQLException e) {
			System.out.println("N�o poss�vel carregar a lista de pessoas");
		}
		
	
		return pessoas;
	}
	
	private Pessoa carregarPessoa(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		return new Pessoa (id,nome);
	}

	
	public Pessoa buscarPorId (Integer id) {
		Pessoa pessoa = null;
		if (id!= null) {
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from pessoas where id = ?");
			comando.setInt(1,id);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()) {
				pessoa = carregarPessoa(cursor);
			}
			cursor.close();
			comando.close();
			
		} catch (SQLException e) {
			System.out.println("N�p foi poss�vel  carregar o contato solicitado");
			
		}
	}
	return pessoa;
}
	
	public void inserir(Pessoa pessoa) {
		if(pessoa != null) {
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("insert into pessoas(nome) values (?)", Statement.RETURN_GENERATED_KEYS);
				comando.setString(1, pessoa.getNome());
				comando.execute();
				ResultSet cursor = comando.getGeneratedKeys();
				if(cursor.next()) {
					Integer id = cursor.getInt("id");
					pessoa.setId(id);
				}
				cursor.close();
				comando.close();
			} catch (SQLException e) {
				e.printStackTrace();
			System.out.println("N�o foi poss�vel inserir os dados da pessoa");
			}
		}
	}
	
	public void atualizar (Pessoa pessoa) {
		if(pessoa != null && pessoa.getId() != null) {
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("update pessoas set nome = ? where id = ?");
				comando.setString(1, pessoa.getNome());
				comando.setInt(2, pessoa.getId());
				comando.executeUpdate();
				comando.close();
			}catch (SQLException e) {
				System.out.println("N�o foi poss�vel atualizar os dados da pessoa");
			}
		}
	}
	
	public void remover (Integer id) {
		if(id != null)
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("delete from pessoas where id = ?");
				comando.setInt(1, id);
				comando.execute();
				comando.close();
			}catch (SQLException e) {
				System.out.println("N�o foi poss�vel remover os dados da pessoa");
			}
		}
	
	}


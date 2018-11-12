package br.com.cursojava.introducao;

public class Contato {
	
	private String nome;
	private String email;
	private String telefone;
	
	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contato(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}

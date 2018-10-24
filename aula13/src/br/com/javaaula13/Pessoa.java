package br.com.javaaula13;

public class Pessoa {
	
	private String codigo;
	private String nome;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String codigo) {
		this();
		setNome(nome);
		setCodigo(codigo);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}

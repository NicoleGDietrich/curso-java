package br.com.javaaula11;

public class Aluno {
	
	/*
	 * 3) Crie uma classe Aluno que deve possuir os atributos nome, telefone, matr�cula. A classe
	 * tamb�m deve possuir m�todos de configura��o e acesso para cada um dos atributos definidos.
	 */
	String nome;
	String telefone;
	String matricula;

	void configuraNome(String nome) {
		this.nome = nome;
	}

	String retornaNome() {
		return nome;
	}
	void configuraTelefone(String telefone) {
		this.telefone = telefone;
	}

	String retornaTelefone() {
		return telefone;
	}
	void configuraMatricula(String matricula) {
		this.matricula = matricula;
	}

	String retornaMatricula() {
		return matricula;
	}

}

package br.com.javaaula11;

public class Produto {

	/**
	 * 1) Crie uma classe Produto que possua os atributos nome e pre�o, a classe
	 * tamb�m deve possuir m�todos de configura��o e acesso para cada um dos
	 * atributos.
	 */
	private String nome;
	private double preco;
	private boolean promocao;

	public void setPreco(double preco) {
		if(preco>=0.01) {
			this.preco = preco;
		}else {
			System.out.println("Valor inv�lido para o produto");
		}
	}

	public double getPreco() {
		return preco;

	}
	public void setNome(String nome) {  //configura��o => set
		this.nome = nome;
	}

	public String getNome() {    // acesso => get
		return nome;
	}
	public boolean isPromocao() {
		return promocao;
	}
	public void setPromocao (boolean promocao) {
		this.promocao = promocao;
	}
	


}

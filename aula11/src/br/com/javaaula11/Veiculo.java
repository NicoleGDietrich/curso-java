package br.com.javaaula11;

public class Veiculo {

	/**
	 * 2) Crie uma classe Veiculo, que possua os atributos marca, modelo, cor, ano de fabricação
	 * e ano modelo. A classe também deve possuir métodos de configuração e acesso para cada um
	 * dos atributos definidos.
	 */
	
	String marca;
	String modelo;
	String cor;
	String anoDeFabricacao;
	String anoModelo;

	void configuraNome(String marca) {
		this.marca = marca;
	}

	String retornaMarca() {
		return marca;
	}

	void configuraModelo(String modelo) {
		this.modelo = modelo;
	}

	String retornaModelo() {
		return modelo;

	}
	void configuraCor(String cor) {
		this.cor = cor;
	}

	String retornaCor() {
		return cor;
	}
	void configuraAnoDeFabricacao(String anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	String retornaAnoDeFabricacao() {
		return anoDeFabricacao;
	}	

	void configuraAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	String retornaAnoModelo() {
		return anoModelo;
	}
	
}
	
	


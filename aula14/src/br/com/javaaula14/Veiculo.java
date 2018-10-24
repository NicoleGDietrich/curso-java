package br.com.javaaula14;

public class Veiculo {
	
	/**
	 * Crie uma aplicação para cadastro de veículos, cada veiculo deve possuir as seguintes
	 * propriedades:
	 * id : Integer
	 * marca: String
	 * modelo: String
	 * placa: String
	 * anoFabricacao: int
	 * anoModelo: int
	 * cor: String
	 * 
	 * O sisyema deve permitir o cadastro de um novo veículo, a listagem de todos os veiculos, a
	 * pesquisa de veículos por marca, a pesquisa de veículos por modelo, a pesquisa de veículos
	 * por placa, a pesquisa de veículos por ano de fabricação e a remoção de veículos.
	 * 
	 * Marca e modelos são propiedades obrigatórias e devem possuir ao menos 3 caracteres não 
	 * vazios (espaços)
	 * A placa é uma propriedade obrigatória, e deve possuir obrigatoriamente 7 caracteres.
	 * O ano de fabricação deve ser maior ou igual a 2000.
	 * O ano modelo não deve ser menor que o ano de fabricação.
	 */
	private Integer id;
	private String marca;
	private String modelo;
	private String placa;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String cor;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Integer getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}

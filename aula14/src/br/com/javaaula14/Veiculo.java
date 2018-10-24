package br.com.javaaula14;

public class Veiculo {
	
	/**
	 * Crie uma aplica��o para cadastro de ve�culos, cada veiculo deve possuir as seguintes
	 * propriedades:
	 * id : Integer
	 * marca: String
	 * modelo: String
	 * placa: String
	 * anoFabricacao: int
	 * anoModelo: int
	 * cor: String
	 * 
	 * O sisyema deve permitir o cadastro de um novo ve�culo, a listagem de todos os veiculos, a
	 * pesquisa de ve�culos por marca, a pesquisa de ve�culos por modelo, a pesquisa de ve�culos
	 * por placa, a pesquisa de ve�culos por ano de fabrica��o e a remo��o de ve�culos.
	 * 
	 * Marca e modelos s�o propiedades obrigat�rias e devem possuir ao menos 3 caracteres n�o 
	 * vazios (espa�os)
	 * A placa � uma propriedade obrigat�ria, e deve possuir obrigatoriamente 7 caracteres.
	 * O ano de fabrica��o deve ser maior ou igual a 2000.
	 * O ano modelo n�o deve ser menor que o ano de fabrica��o.
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

package br.com.javaaula16;

public class Funcionario extends Object{
	
	private String codigo;
	private String nome;
	private double salarioBase;
	
	public Funcionario (String codigo, String nome, double salarioBase) {
		this();
		setCodigo(codigo);
		setNome(nome);
		setSalarioBase(salarioBase);
		System.out.println("Executou o construtor em funcionario");
	
	}
	
	public Funcionario() {
		super();
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
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double salarioLiquido() {
		double salario = getSalarioBase() - (getSalarioBase()*0.11);
		return salario;
	}
	
	

}

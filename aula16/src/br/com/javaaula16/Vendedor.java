package br.com.javaaula16;

public class Vendedor extends Funcionario{
	
	
	private double percentualVenda;
	private double totalVendas = 10;
	
	{
		System.out.println("Oi, eu sou o Goku!!!!");
	}
	
	public Vendedor() {
		
	}
	
	public Vendedor(String codigo, String nome, double salarioBase) {
		super(codigo, nome, salarioBase);
	    System.out.println("Primeira linha depois do super");
	    System.out.println(totalVendas);
	}
	
	
	public double getPercentualVenda() {
		return percentualVenda;
	}
	public void setPercentualVenda(double percentualVenda) {
		this.percentualVenda = percentualVenda>1 ? percentualVenda/100 : percentualVenda;
	}
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	public double salarioLiquido() {
		double acrescimo = 0;
		if(totalVendas >= 20000) {
			acrescimo = totalVendas * getPercentualVenda();
		}
		double salario = (getSalarioBase() + acrescimo)* (1-0.11);
		return salario;
	}

}

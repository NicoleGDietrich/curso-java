package br.com.javaaula14;

import java.util.ArrayList;


public class VeiculoController {
	
	private VeiculoRepositorio repositorio = new VeiculoRepositorio();

	public boolean adicionarVeiculo(String marca, String modelo, String placa, Integer anoFabricacao, Integer anoModelo, String cor) {
		Veiculo veiculo = new Veiculo();
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setPlaca(placa);
		veiculo.setAnoFabricacao(anoFabricacao);
		veiculo.setAnoModelo(anoModelo);
		veiculo.setCor(cor);
		
		return repositorio.adicionarVeiculo(veiculo);
	}

	public boolean isMarcaValido(String marca) {
		boolean valido = marca !=null && !"".equals(marca.trim()) && marca.length() >=3;
		return valido;
	}
	public boolean isModeloValido(String modelo) {
		boolean valido = modelo !=null && !"".equals(modelo.trim()) && modelo.length() >=3;
		return valido;
	}
	public boolean isPlacaValido(String placa) {
		boolean valido = placa !=null && !"".equals(placa.trim()) && placa.length() ==7;
		return valido;
	}
	public boolean isAnoFabricacaoValido(Integer anoFabricacao) {
		boolean valido = anoFabricacao!=null && anoFabricacao >= 2000;
		return valido;
	}

	public ArrayList<Veiculo> buscarTodos() {
		
		return repositorio.buscarTodos();
	}
	public ArrayList<Veiculo> pesquisarPorMarca(String marca) {
		ArrayList<Veiculo> todos = buscarTodos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		for (Veiculo veiculo : todos) {
			if(veiculo != null && veiculo.getMarca() != null && veiculo.getMarca().startsWith(marca)){
				lista.add (veiculo);
			}
		}
		return lista;
}
	public ArrayList<Veiculo> pesquisarPorModelo(String modelo) {
		ArrayList<Veiculo> todos = buscarTodos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		for (Veiculo veiculo : todos) {
			if(veiculo != null && veiculo.getModelo() != null && veiculo.getModelo().startsWith(modelo)){
				lista.add (veiculo);
			}
		}
		return lista;
}
	public ArrayList<Veiculo> pesquisarPorPlaca(String placa) {
		ArrayList<Veiculo> todos = buscarTodos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		for (Veiculo veiculo : todos) {
			if(veiculo != null && veiculo.getPlaca() != null && veiculo.getPlaca().startsWith(placa)){
				lista.add (veiculo);
			}
		}
		return lista;
}
	
	public ArrayList<Veiculo> pesquisarPorAnoFabricacao(Integer anoFabricacao) {
		ArrayList<Veiculo> todos = buscarTodos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		for (Veiculo veiculo : todos) {
			if(veiculo != null && veiculo.getAnoFabricacao() != null){
				lista.add (veiculo);
			}
		}
		return lista;
}
	public boolean removerVeiculo(Integer id) {
		return repositorio.remover(id);
	}	
}

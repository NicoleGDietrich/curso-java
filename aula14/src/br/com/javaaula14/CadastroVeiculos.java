package br.com.javaaula14;
import java.util.ArrayList;
import java.util.Scanner;




public class CadastroVeiculos {
	
	private static final int REMOVER_VEICULO = 7;
	private static final int PESQUISAR_ANO_FABRIC = 6;
	private static final int PESQUISAR_PLACA = 5;
	private static final int PESQUISAR_MODELO = 4;
	private static final int PESQUISAR_MARCA = 3;
	private static final int LISTAR = 2;
	private static final int NOVO = 1;
	private static final int SAIR = 8;
	private VeiculoController controller = new VeiculoController();

	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;
		
		do{
			System.out.println("======== MENU PRINCIPAL ========");
			System.out.println("1 - Cadastrar Ve�culo");
			System.out.println("2 - Listar Ve�culos");
			System.out.println("3 - Pesquisar por marca");
			System.out.println("4 - Pesquisar por modelo");
			System.out.println("5 - Pesquisar por placa");
			System.out.println("6 - Pesquisar por por ano de fabrica��o");
			System.out.println("7 - Remover ve�culo");
			System.out.println("8 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao,teclado);
		}while(opcao != SAIR);
		
	}


private void tratarOpcao(int opcao, Scanner teclado) {
	switch (opcao) {
	case NOVO:
		novoVeiculo(teclado);
		break;
	case LISTAR:
		listarVeiculos();
		break;
	case PESQUISAR_MARCA:
	    pesquisarPorMarca(teclado);
		break;
	case PESQUISAR_MODELO:
		pesquisarPorModelo(teclado);
		break;
	case PESQUISAR_PLACA:
		pesquisarPorPlaca(teclado);
		break;
	case PESQUISAR_ANO_FABRIC:
		pesquisarPorAnoFabric(teclado);
		break;
	
	case SAIR:
		System.out.println("Obrigado por usar nosso sistema");
		break;

	default:
		System.out.println("Op��o Inv�lida");
		break;
	}
}
	private void novoVeiculo(Scanner teclado) {
		System.out.println("======== NOVO VE�CULO =============");
		String marca;
		do{
			System.out.println("Marca:");
			marca = teclado.nextLine();
		}while(!controller.isMarcaValido(marca));
		String modelo;
		do {
		System.out.println("Modelo:");
		modelo = teclado.nextLine();
		}while (!controller.isModeloValido(modelo));
		String placa;
		do {
		System.out.println("Placa:");
		placa = teclado.nextLine();
		}while (!controller.isPlacaValido(placa));
		int anoFabricacao;
		int anoModelo;
		String cor;
		do {
			System.out.println("Ano de fabrica��o:");
		     anoFabricacao = Integer.parseInt(teclado.nextLine());
			System.out.println("Ano do modelo:");
			anoModelo = Integer.parseInt(teclado.nextLine());
			System.out.println("Cor:");
			cor = teclado.nextLine();
		}while (!controller.isAnoFabricacaoValido(anoFabricacao));
		
		boolean ok = controller.adicionarVeiculo(marca,modelo,placa, anoFabricacao, anoModelo, cor);
		if(ok){
			System.out.println("Ve�culo adicionado com sucesso");
		}else{
			System.out.println("N�o foi poss�vel adicionar o ve�culo");
		}
		
		
	}

     private void listarVeiculos() {
	 ArrayList<Veiculo> lista = controller.buscarTodos();
	 System.out.println("======== LISTA DE VE�CULOS =============");
	 for (Veiculo veiculo : lista) {
		System.out.printf("%d - %s - %s - %s - %s - %s - %s \n",veiculo.getMarca(),veiculo.getModelo(),veiculo.getPlaca(),veiculo.getAnoFabricacao(), veiculo.getAnoModelo(), veiculo.getCor());
	}
	
}
     private void pesquisarPorMarca(Scanner teclado) {
    	 System.out.println("======== PESQUISAR POR MARCA =============");
			System.out.println("Marca:");
			String marca = teclado.nextLine();
			ArrayList<Veiculo> lista = controller.pesquisarPorMarca(marca);
			for (Veiculo veiculo : lista) {
				System.out.printf("%d - %s - %s - %s - %s - %s - %s \n",veiculo.getMarca(),veiculo.getModelo(),veiculo.getPlaca(),veiculo.getAnoFabricacao(), veiculo.getAnoModelo(), veiculo.getCor());
			}
			
		}
     private void pesquisarPorModelo(Scanner teclado) {
    	 System.out.println("======== PESQUISAR POR MODELO =============");
			System.out.println("Modelo:");
			String modelo = teclado.nextLine();
			ArrayList<Veiculo> lista = controller.pesquisarPorModelo(modelo);
			for (Veiculo veiculo : lista) {
				System.out.printf("%d - %s - %s - %s - %s - %s - %s \n",veiculo.getMarca(),veiculo.getModelo(),veiculo.getPlaca(),veiculo.getAnoFabricacao(), veiculo.getAnoModelo(), veiculo.getCor());
			}
			
		}
     private void pesquisarPorPlaca(Scanner teclado) {
    	 System.out.println("======== PESQUISAR POR PLACA =============");
			System.out.println("Placa:");
			String placa = teclado.nextLine();
			ArrayList<Veiculo> lista = controller.pesquisarPorPlaca(placa);
			for (Veiculo veiculo : lista) {
				System.out.printf("%d - %s - %s - %s - %s - %s - %s \n",veiculo.getMarca(),veiculo.getModelo(),veiculo.getPlaca(),veiculo.getAnoFabricacao(), veiculo.getAnoModelo(), veiculo.getCor());
			}
			
		}
     private void pesquisarPorAnoFabric(Scanner teclado) {
    	 System.out.println("======== PESQUISAR POR ANO DE FABRICA��O =============");
			System.out.println("Ano de fabrica��o:");
			String anoDeFabricacao = teclado.nextLine();
			ArrayList<Veiculo> lista = controller.pesquisarPorMarca(anoDeFabricacao);
			for (Veiculo veiculo : lista) {
				System.out.printf("%d - %s - %s - %s - %s - %s - %s \n",veiculo.getMarca(),veiculo.getModelo(),veiculo.getPlaca(),veiculo.getAnoFabricacao(), veiculo.getAnoModelo(), veiculo.getCor());
			}
			
		}
     
     }



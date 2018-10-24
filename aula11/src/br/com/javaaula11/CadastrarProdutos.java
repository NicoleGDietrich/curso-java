package br.com.javaaula11;
import java.util.Scanner;

public class CadastrarProdutos {
	
	ProdutoController controller = new ProdutoController();
	public void mostrarMenu (Scanner teclado) {
		int opcao = 0;
		do {
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Valor total do produtos");
			System.out.println("4 - Filtrar preços");
			System.out.println("5 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao (opcao, teclado);
		}while (opcao != 5);
		
	}
	private void tratarOpcao(int opcao, Scanner teclado) {
		switch(opcao) {
		case 1:
			cadastrarProduto(teclado);
			break;
		case 2:
			listarProdutos();
			break;
		case 3:
			somarProdutos();
			break;
		case 4:
			filtrarPrecos(teclado);
			break;
		case 5:
			System.out.println("Obrigado por usar nossos terminais.");
			break;
			default:
			System.out.println("Opcão inválida");
		}
	}
	
	  private void cadastrarProduto(Scanner teclado) {
		  System.out.println("======== CADASTRAR PRODUTO ========");
		  System.out.println("Informe o nome do produto");
		  String nome = teclado.nextLine();
		  System.out.println("Informe o preço do produto");
		  double preco = Double.parseDouble(teclado.nextLine());
		  boolean ok = controller.adicionar(nome, preco);
		  if(ok) {
			  System.out.println("Produto adicionado com sucesso");
			  
		  }else {
			  System.out.println("Não foi possível adicionar o produto");
		  }
	  }
		  private void listarProdutos() {
			  System.out.println("======== LISTA DE PRODUTOS ========");
			  Produto atual = null;
			  Produto[] produtos = controller.listarProdutos();
			  for (int index = 0; index < produtos.length; index++) {
				  atual = produtos[index];
				  System.out.printf("%d - %.2f - %s \n", index+1, atual.getPreco(),atual.getNome());
			  
		  }
	  }
		  private void somarProdutos() {
			  System.out.println("======== VALOR TOTAL DOS PRODUTOS ========");
			double soma = controller.somaProdutos();
			System.out.printf("A soma dos produtos cadastrados é %.2f \n",soma);
		  }


		  private void filtrarPrecos(Scanner teclado) {
			  System.out.println("======== FILTRO DOS PREÇOS ========");
			  System.out.println("Informe o preço mínimo do produto");
			  double precoMinimo = Double.parseDouble(teclado.nextLine());
			  Produto[] produtos = controller.listarProdutosPorPrecoMinimo(precoMinimo);
              if(produtos != null && produtos.length>0) {
            	  for (Produto atual : produtos) {
			 
			    	  System.out.printf("%.2f - %s \n", atual.getPreco(),atual.getNome());
            	  }  
			      }else {
			    	  System.out.println("Não existem produtos com o preço mínimo informado");
			 
			 
			    
			  
			  }
		  }
}

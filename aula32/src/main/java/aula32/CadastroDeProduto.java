package aula32;

import java.util.ArrayList;
import java.util.Scanner;


public class CadastroDeProduto {
	
	private static final int REMOVER_PRODUTO = 6;
	private static final int EDITAR_PRODUTO = 5;
	private static final int LISTAR_NOME = 4;
	private static final int LISTAR_FAIXA_PRECO = 3;
	private static final int LISTAR_PRODUTO = 2;
	private static final int CADASTRAR = 1;
	private static final int SAIR = 7;
	private ProdutoController controller = new ProdutoController();
	
	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;
		
		do{
			System.out.println("======== MENU PRINCIPAL ========");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Listar produto");
			System.out.println("3 - Listar produtos por Faixa de Preço");
			System.out.println("4 - Listar produtos por nome");
			System.out.println("5 - Editar produto");
			System.out.println("6 - Remover produto");
			System.out.println("7 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao,teclado);
		}while(opcao != SAIR);
		
	}
	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case CADASTRAR:
			cadastrarProduto(teclado);
			break;
		case LISTAR_PRODUTO:
			listarProduto();
			break;
		case LISTAR_FAIXA_PRECO:
			listarFaixaPreco(teclado);
			break;
		case LISTAR_NOME:
			listarNome(teclado);
			break;
		case EDITAR_PRODUTO:
			atualizarProduto(teclado);
			break;
		case REMOVER_PRODUTO:
			removerProduto(teclado);
			break;
		case SAIR:
			System.out.println("Obrigado por usar nosso sistema");
			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}
		

	}
	private void listarFaixaPreco(Scanner teclado) {
		System.out.println("======== LISTA DE PRODUTOS DE ACORDO COM O PREÇO ========");
		System.out.println("Digite o preço mínimo:");
		double minimo = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite o preço máximo:");
		double maximo = Integer.parseInt(teclado.nextLine());
		ArrayList<Produto> lista = controller.buscarPorPreco(minimo, maximo);
		for (Produto produto : lista) {
			System.out.printf("%d - %s - %s \n",produto.getId(),produto.getNome(),produto.getPreco());
		}
		
	}
	
	private void atualizarProduto(Scanner teclado) {
		System.out.println("======== EDITAR PRODUTO ========");
		int id;
		do{
			System.out.println("Digite o id do produto: ");
			id = Integer.parseInt(teclado.nextLine());
		}while(!controller.isIdValido(id));
		String nome;
		do{
			System.out.println("Digite um outro nome para o produto: ");
			nome = teclado.nextLine();
		}while(!controller.isNomeValido(nome));
		
		Double preco;
		do{
			System.out.println("Digite um outro preço para o produto: ");
			preco = Double.parseDouble(teclado.nextLine());
		}while(!controller.isPrecoValido(preco));
		
		controller.atualizarProduto(id, nome, preco);
		
}
	private void removerProduto(Scanner teclado) {
		System.out.println("======== REMOVER PRODUTO ========");
		Integer id;
		do{
			System.out.println("Digite o id do produto para removê-lo: ");
			id = Integer.parseInt(teclado.nextLine());
		}while(!controller.isIdValido(id));
        controller.removerProduto(id);
		
	
	}
	private void listarNome(Scanner teclado) {
		System.out.println("======== LISTAR POR NOME =============");
		System.out.println("Nome:");
		String nome = teclado.nextLine();
		ArrayList<Produto> lista = controller.buscarPorNome(nome);
		for (Produto produto : lista) {
			System.out.printf("%d - %s - %s \n",produto.getId(),produto.getNome(),produto.getPreco());
		}
		
	
	}
	private void listarProduto() {
		ArrayList<Produto> lista = controller.buscarTodos();
		System.out.println("======== LISTA DE PRODUTOS =============");
		for (Produto produto : lista) {
			System.out.printf("%d - %s - %s \n",produto.getId(),produto.getNome(),produto.getPreco());
		}
		
	}

	
	private void cadastrarProduto(Scanner teclado) {
		System.out.println("======== NOVO PRODUTO ========");
		String nome;
		do{
			System.out.println("Nome do produto: ");
			nome = teclado.nextLine();
			
		}while(!controller.isNomeValido(nome));
		
		Double preco;
		do {
			System.out.println("Preço: ");
			preco = Double.parseDouble(teclado.nextLine());
		}while (!controller.isPrecoValido(preco));
			
		controller.adicionarProduto(nome,preco);
	
		
	}

		
	}





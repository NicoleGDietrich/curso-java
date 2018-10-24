package br.com.javaaula6;
import java.util.Scanner;

public class Exercicio7{
	
	public static void main(String[] args) {
		
		/**
		 * 7) Escreva um programa que apresente o menu abaixo para o usuário, e após a escolha do 
		 * usuário apresente uma mensagem correspondente ao tipo de operação selecionada. O 
		 * programa deve continuar executando até que o usuário escolha a opção sair. Caso o
		 * usuário escolha uma opção diferente, o programa de apresentar a mensagem "Opção
		 * inválida".
		 * 
		 * 1-Cadastrar aluno     Escolheu a opção ...
		 * 2-Cadastrar professor //
		 * 3-Cadastrar turma     //
		 * 4-Sair                   
		 */
		Scanner teclado = new Scanner (System.in);
		
		int opcao = -1;
		System.out.println("1 - Cadastrar Aluno");
		System.out.println("2 - Cadastrar Professor");
		System.out.println("3 - Cadastrar Turma");
		System.out.println("4 - Sair");
		opcao = Integer.parseInt(teclado.nextLine());
		switch (opcao) {
		case 1:
		System.out.println("Escolheu a opção Cadastrar Aluno");
		break;
		case 2:
			System.out.println("Escolheu a opção Cadastrar Professor");
			break;
		case 3:
			System.out.println("Escolheu a opção Cadastrar Turma");
			break;
		case 4:
			System.out.println("Fim do exercício");
			break;
		default:
			System.out.println("Opção inválida");
			break;
			
	 
		
		}
	}

}

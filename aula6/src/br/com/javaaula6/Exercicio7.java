package br.com.javaaula6;
import java.util.Scanner;

public class Exercicio7{
	
	public static void main(String[] args) {
		
		/**
		 * 7) Escreva um programa que apresente o menu abaixo para o usu�rio, e ap�s a escolha do 
		 * usu�rio apresente uma mensagem correspondente ao tipo de opera��o selecionada. O 
		 * programa deve continuar executando at� que o usu�rio escolha a op��o sair. Caso o
		 * usu�rio escolha uma op��o diferente, o programa de apresentar a mensagem "Op��o
		 * inv�lida".
		 * 
		 * 1-Cadastrar aluno     Escolheu a op��o ...
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
		System.out.println("Escolheu a op��o Cadastrar Aluno");
		break;
		case 2:
			System.out.println("Escolheu a op��o Cadastrar Professor");
			break;
		case 3:
			System.out.println("Escolheu a op��o Cadastrar Turma");
			break;
		case 4:
			System.out.println("Fim do exerc�cio");
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
			
	 
		
		}
	}

}

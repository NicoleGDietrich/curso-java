package br.com.javaaula11;

import java.util.Scanner;

public class AppProduto {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
			CadastrarProdutos cadastro = new CadastrarProdutos();
			cadastro.mostrarMenu(teclado);
			teclado.close();
		}
	
	}



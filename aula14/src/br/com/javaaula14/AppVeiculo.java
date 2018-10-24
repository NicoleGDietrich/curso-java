package br.com.javaaula14;

import java.util.Scanner;


public class AppVeiculo {
	public static void main(String[] args) {
		
	
	Scanner teclado = new Scanner (System.in);
	CadastroVeiculos cadastro = new CadastroVeiculos();
		cadastro.mostrarMenu(teclado);
		teclado.close();
	}

}


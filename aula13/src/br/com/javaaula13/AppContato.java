package br.com.javaaula13;

import java.util.Scanner;


public class AppContato {
public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		CadastroDeContato cadastro = new CadastroDeContato();
		cadastro.mostrarMenu(teclado);
		teclado.close();
		}
	

}

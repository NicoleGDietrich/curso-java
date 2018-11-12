package aula32;

import java.util.Scanner;



public class AppProduto {
	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		CadastroDeProduto produto = new CadastroDeProduto();
		produto.mostrarMenu(teclado);
		teclado.close();
		}
	

}




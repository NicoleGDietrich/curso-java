package br.com.java.aula17.colecoes;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ExemploList {
	public static void main(String[] args) {
	List<String> nomes = new ArrayList<>();
	nomes.add("Jo�o");
	nomes.add("Maria");
	nomes.add("Ad�o");
	nomes.add("Eva");
	
	System.out.println(nomes);
	Collections.sort(nomes);
	System.out.println(nomes);
	Collections.sort(nomes,Collections.reverseOrder());
	System.out.println(nomes);
	
	
	
	List <Contato> contatos = new ArrayList<>();
	contatos.add(new Contato("Jo�o", "joao@gmail.com"));
	contatos.add(new Contato("Maria"));
	contatos.add(new Contato("Ad�o"));
	contatos.add(new Contato("Eva"));
	
	System.out.println(contatos);
	Collections.sort(contatos);
	System.out.println(contatos);
	
	
	
	
	}
}

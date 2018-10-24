package br.com.java.aula24;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RepositorioContatoMemory implements RepositorioContato{
	
	private static int count = 1;
	private static List<Contato> contatos = new ArrayList<>();
	
	
	@Override
	public boolean adicionar(Contato contato) {
		boolean resultado = false;
		if(contato != null){
			contato.setId(count++);
			resultado = contatos.add(contato);
		}
		
		return resultado;
	}
	@Override
	public boolean editar(Contato contato) {
		boolean resultado = false;
		Optional <Contato> data = contatos.stream().filter(c) -> c.getId().equals(contato.getId)))
		return false;
	}
	@Override
	public List<Contato> buscarTodos() {
		
		return contatos;
	}
	@Override
	public List<Contato> buscarPorNome(String nome) {
		Stream<Contato> streamContato = contatos.stream();	
		List<Contato> contatosPorNome = streamContato
		.filter((Contato contato)->{return nome.equals(contato.getNome());})
        .collect(Collectors.toList());
        return contatosPorNome;
	}
	@Override
	public List<Contato> buscarPorTelefone(String telefone) {
		Stream<Contato> streamContato = contatos.stream();	
		List<Contato> contatosPorTelefone = streamContato
		.filter((Contato contato)->{return telefone.equals(contato.getTelefone());})
        .collect(Collectors.toList());
        return contatosPorTelefone;
	}
	@Override
	public List<Contato> buscarPorTipo(TipoContato tipo) {
		Stream<Contato> streamContato = contatos.stream();	
		List<Contato> contatosPorTipo = streamContato
		.filter((Contato contato)->{return tipo.equals(contato.getTipo());})
        .collect(Collectors.toList());
        return contatosPorTipo;
	}
	@Override
	public Contato buscarPorId(Integer id) {
		Stream<Contato> streamContato = contatos.stream();	
		List<Contato> contatosPorId = streamContato
		.filter((Contato contato)->{return id.equals(contato.getId());})
        .collect(Collectors.toList());
        return (Contato) contatosPorId;
	}
	@Override
	public boolean remover(Contato contato) {
		boolean resultado = false;
		if (contato != null) {
			Integer id = contato.getId();
			resultado = contatos.remove(id);
			
			
		}
		return resultado;
	}
	}
	
	
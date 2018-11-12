package br.com.cursojava.introducao;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="exercicioBean")
@SessionScoped

public class ExercicioBean {
	private String nome;
	private String time;
	private Integer posicao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getPosicao() {
		return posicao;
	}
	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}
	
	public String salvar() {
		if(this.nome != null && this.nome.length() >=3) {
			return "result2";
			
		}else {
			return null;
		}
	}
	

	
}

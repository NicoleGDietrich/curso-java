package aula33;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="funcionarios")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column 
	private String nome;
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "id_endereco", nullable = false)
	private Endereco idEndereco;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(Endereco idEndereco) {
		this.idEndereco = idEndereco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Funcionarios [id=" + id + ", nome=" + nome + ", idEndereco=" + idEndereco + "]";
	}
	public Funcionario(Integer id, String nome, Endereco idEndereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.idEndereco = idEndereco;
	}
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

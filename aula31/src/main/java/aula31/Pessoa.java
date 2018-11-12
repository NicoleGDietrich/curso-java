package aula31;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // essa classe representa uma entidade do banco de dados
@Table(name="pessoas") //indica a tabela no banco de dados
public class Pessoa {
	
	@Id // indica a chave primária, que é o id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica que o id é gerado pelo banco e identity indica que vai pegar o valor do serial
	private Integer id;
	
	@Column (nullable = false, length =100) //indica que a propriedade nome é uma coluna no banco de dados
	private String nome;
	public Pessoa(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
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
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
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

}

package br.edu.infnet.appfazenda.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tdazenda")
public class Fazenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private boolean alvara;
	private String cnpj;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public Fazenda() {
	}
	
	public Fazenda(Integer id) {
		this.id = id;
	}
	
	public Fazenda(String nome, boolean alvara, String cnpj) {
		this.nome = nome;
		this.alvara = alvara;
		this.cnpj = cnpj;
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

	public boolean isAlvara() {
		return alvara;
	}

	public void setAlvara(boolean alvara) {
		this.alvara = alvara;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Fazenda [id=" + id + ", nome=" + nome + ", alvara=" + alvara + ", cnpj=" + cnpj + ", usuario=" + usuario
				+ "]";
	}
}

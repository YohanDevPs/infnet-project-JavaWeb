package br.edu.infnet.appfazenda.model.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tinsumo")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Insumo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private float quantidade;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	@ManyToMany(mappedBy = "insumos")
	private List<Aquisicao> aquisicaos;
	
	public Insumo() {

	}
	
	public Insumo(Integer id) {
		this.id = id;
	}
	
	public Insumo(String nome, float quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return String.format("%s;%.2f", nome, quantidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Aquisicao> getPedidos() {
		return aquisicaos;
	}

	public void setPedidos(List<Aquisicao> aquisicaos) {
		this.aquisicaos = aquisicaos;
	}
}

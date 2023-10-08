package br.edu.infnet.appfazenda.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.appfazenda.enums.TipoSemente;

@Entity
@Table(name = "tsemente")
public class Semente extends Insumo {
	
    private String descricao;
    @Column(name = "tipo_semente")
    private TipoSemente tipoSemente;
    private float valor;
    
    public Semente() {
	}
	
	public Semente(Integer id) {
		super(id);
	}

	public Semente(String nome, float quantidade, String descricao, TipoSemente tipoSemente, float valor) {
		super(nome, quantidade);
		this.descricao = descricao;
		this.tipoSemente = tipoSemente;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Semente [descricao=" + descricao + ", tipoSemente=" + tipoSemente + ", valor=" + valor + "]";
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoSemente getTipoSemente() {
		return tipoSemente;
	}

	public void setTipoSemente(TipoSemente tipoSemente) {
		this.tipoSemente = tipoSemente;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}
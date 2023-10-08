package br.edu.infnet.appfazenda.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.appfazenda.enums.TipoFertilizante;

@Entity
@Table(name = "tfertilizante")
public class Fertilizante extends Insumo {
	
    private String descricao;
    @Column(name = "tipo_fertilizante")
    private TipoFertilizante tipoFertilizante;
    private float valor;
	
	public Fertilizante() {

	}
	
	public Fertilizante(Integer id) {
		super(id);
	}
	
	public Fertilizante(String nome, float quantidade, String descricao, TipoFertilizante tipoFertilizante,
			float valor) {
		super(nome, quantidade);
		this.descricao = descricao;
		this.tipoFertilizante = tipoFertilizante;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%.2f", 
				super.toString(),
				descricao, 
				tipoFertilizante, 
				valor
			);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoFertilizante getTipoFertilizante() {
		return tipoFertilizante;
	}

	public void setTipoFertilizante(TipoFertilizante tipoFertilizante) {
		this.tipoFertilizante = tipoFertilizante;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}

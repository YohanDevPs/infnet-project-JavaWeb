package br.edu.infnet.appfazenda.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.appfazenda.enums.TipoAgrotoxico;

@Entity
@Table(name = "tagrotoxico")
public class Agrotoxico extends Insumo {
	
    private String descricao;
    @Column(name = "tipo_agrotoxico")
    private TipoAgrotoxico tipoAgrotoxico;
    private float valor;

	
	public Agrotoxico() {

	}
	
	public Agrotoxico(Integer id) {
		super(id);
	}
	
	public Agrotoxico(String nome, float quantidade, String descricao, TipoAgrotoxico tipoAgrotoxico, float valor) {
		super(nome, quantidade);
		this.descricao = descricao;
		this.tipoAgrotoxico = tipoAgrotoxico;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return String.format("%s;%s;%.2f", 
				super.toString(),
				descricao, 
				tipoAgrotoxico, 
				valor
			);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoAgrotoxico getTipoAgrotoxico() {
		return tipoAgrotoxico;
	}

	public void setTipoAgrotoxico(TipoAgrotoxico tipoAgrotoxico) {
		this.tipoAgrotoxico = tipoAgrotoxico;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}

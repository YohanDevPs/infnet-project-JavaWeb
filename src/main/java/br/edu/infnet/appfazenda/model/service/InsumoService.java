package br.edu.infnet.appfazenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfazenda.model.domain.Insumo;
import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.repository.InsumoRepository;

@Service
public class InsumoService {
	
	@Autowired
	private InsumoRepository insumoRepository;
	
	public Collection<Insumo> obterLista(Usuario usuario){
		return (Collection<Insumo>) insumoRepository.obterLista(usuario.getId());
	}

	public void incluir(Insumo insumo) {

		insumoRepository.save(insumo);
	}
	
	public void excluir(Integer id) {

		insumoRepository.deleteById(id);
	}	
}
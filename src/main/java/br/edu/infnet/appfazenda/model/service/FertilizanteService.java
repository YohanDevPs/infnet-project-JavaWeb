package br.edu.infnet.appfazenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfazenda.model.domain.Fertilizante;
import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.repository.FertilizanteRepository;

@Service
public class FertilizanteService {
	
	@Autowired
	private FertilizanteRepository fertilizanteRepository;

	public Collection<Fertilizante> obterLista(){
		
		return (Collection<Fertilizante>) fertilizanteRepository.findAll();
	}
	
	public Collection<Fertilizante> obterLista(Usuario usuario){
		
		return (Collection<Fertilizante>) fertilizanteRepository.obterLista(usuario.getId());
	}

	public void incluir(Fertilizante fertilizante) {

		fertilizanteRepository.save(fertilizante);
	}
	
	public void excluir(Integer id) {

		fertilizanteRepository.deleteById(id);
	}	
}
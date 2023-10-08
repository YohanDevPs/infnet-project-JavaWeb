package br.edu.infnet.appfazenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfazenda.model.domain.Semente;
import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.repository.SementeRepository;

@Service
public class SementeService {
	
	@Autowired
	private SementeRepository sementeRepository;

	public Collection<Semente> obterLista(){
		
		return (Collection<Semente>) sementeRepository.findAll();
	}
	
	public Collection<Semente> obterLista(Usuario usuario){
		
		return (Collection<Semente>) sementeRepository.obterLista(usuario.getId());
	}

	public void incluir(Semente semente) {

		sementeRepository.save(semente);
	}
	
	public void excluir(Integer id) {

		sementeRepository.deleteById(id);
	}	
}
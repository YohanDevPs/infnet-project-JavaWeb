package br.edu.infnet.appfazenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfazenda.model.domain.Agrotoxico;
import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.repository.AgrotoxicoRepository;

@Service
public class AgrotoxicosService {
	
	@Autowired
	private AgrotoxicoRepository agrotoxicoRepository;

	public Collection<Agrotoxico> obterLista(){
		
		return (Collection<Agrotoxico>) agrotoxicoRepository.findAll();
	}
	
	public Collection<Agrotoxico> obterLista(Usuario usuario){
		
		return (Collection<Agrotoxico>) agrotoxicoRepository.obterLista(usuario.getId());
	}

	public void incluir(Agrotoxico agrotoxico) {

		agrotoxicoRepository.save(agrotoxico);
	}
	
	public void excluir(Integer id) {

		agrotoxicoRepository.deleteById(id);
	}	
}
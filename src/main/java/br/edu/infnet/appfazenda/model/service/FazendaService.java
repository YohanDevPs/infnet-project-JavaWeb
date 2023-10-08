package br.edu.infnet.appfazenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfazenda.model.domain.Fazenda;
import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.repository.FazendaRepository;

@Service
public class FazendaService {
	
	@Autowired
	private FazendaRepository fazendaRepository;

	public Collection<Fazenda> obterLista(){
		
		return (Collection<Fazenda>) fazendaRepository.findAll();
	}
	
	public Collection<Fazenda> obterLista(Usuario usuario){
		
		return (Collection<Fazenda>) fazendaRepository.obterLista(usuario.getId());
	}

	public void incluir(Fazenda fazenda) {

		fazendaRepository.save(fazenda);
	}
	
	public void excluir(Integer id) {
		fazendaRepository.deleteById(id);
	}	
}
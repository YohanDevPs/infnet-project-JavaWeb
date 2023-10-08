package br.edu.infnet.appfazenda.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfazenda.model.domain.Aquisicao;
import br.edu.infnet.appfazenda.model.domain.Usuario;
import br.edu.infnet.appfazenda.model.repository.AquisicaoRepository;

@Service
public class AquisicaoService {
	
	@Autowired
	private AquisicaoRepository aquisicaoRepository;

	public Collection<Aquisicao> obterLista(){
		
		return (Collection<Aquisicao>) aquisicaoRepository.findAll();
	}
	
	public Collection<Aquisicao> obterLista(Usuario usuario){
		return (Collection<Aquisicao>) aquisicaoRepository.obterLista(usuario.getId());	
	}

	public void incluir(Aquisicao aquisicao) {

		aquisicaoRepository.save(aquisicao);
	}
	
	public void excluir(Integer id) {

		aquisicaoRepository.deleteById(id);
	}	
}
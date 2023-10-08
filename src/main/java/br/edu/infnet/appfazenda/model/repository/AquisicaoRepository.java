package br.edu.infnet.appfazenda.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfazenda.model.domain.Aquisicao;

@Repository
public interface AquisicaoRepository extends CrudRepository<Aquisicao, Integer> {

	@Query("from Aquisicao p where p.usuario.id = :userid")
	public List<Aquisicao> obterLista(Integer userid);
}
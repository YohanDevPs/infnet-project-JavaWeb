package br.edu.infnet.appfazenda.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfazenda.model.domain.Fazenda;

@Repository
public interface FazendaRepository extends CrudRepository<Fazenda, Integer> {

	@Query("from Fazenda s where s.usuario.id = :userid")
	public List<Fazenda> obterLista(Integer userid);
}
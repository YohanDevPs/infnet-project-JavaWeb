package br.edu.infnet.appfazenda.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfazenda.model.domain.Agrotoxico;

@Repository
public interface AgrotoxicoRepository extends CrudRepository<Agrotoxico, Integer> {

	@Query("from Agrotoxico c where c.usuario.id = :userid")
	public List<Agrotoxico> obterLista(Integer userid);
}
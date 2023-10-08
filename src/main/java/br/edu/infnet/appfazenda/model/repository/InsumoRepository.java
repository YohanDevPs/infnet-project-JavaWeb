package br.edu.infnet.appfazenda.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfazenda.model.domain.Insumo;

@Repository
public interface InsumoRepository extends CrudRepository<Insumo, Integer> {

	@Query("from Insumo i where i.usuario.id = :userid")
	public List<Insumo> obterLista(Integer userid);
}
package br.edu.infnet.appfazenda.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfazenda.model.domain.Semente;

@Repository
public interface SementeRepository extends CrudRepository<Semente, Integer> {

	@Query("from Semente b where b.usuario.id = :userid")
	public List<Semente> obterLista(Integer userid);
}
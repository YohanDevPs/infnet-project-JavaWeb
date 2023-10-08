package br.edu.infnet.appfazenda.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfazenda.model.domain.Fertilizante;

@Repository
public interface FertilizanteRepository extends CrudRepository<Fertilizante, Integer> {

	@Query("from Fertilizante s where s.usuario.id = :userid")
	public List<Fertilizante> obterLista(Integer userid);
}
package br.com.academia.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.com.academia.models.ExercicioModel;

@Repository
@Transactional
public class ExercicioDAO {
	@PersistenceContext
	private EntityManager manager;
	
	public void save(ExercicioModel exercicio) {
		manager.persist(exercicio);
	}
}
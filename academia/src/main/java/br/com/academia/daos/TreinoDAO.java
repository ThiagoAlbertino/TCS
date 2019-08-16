package br.com.academia.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.com.academia.models.TreinoModel;

@Repository
@Transactional
public class TreinoDAO {
	@PersistenceContext
	private EntityManager manager;
	
	public void save(TreinoModel treino) {
		manager.persist(treino);
	}
}
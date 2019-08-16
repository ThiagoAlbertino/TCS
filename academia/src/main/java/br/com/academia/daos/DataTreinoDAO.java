package br.com.academia.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.com.academia.models.DataTreinoModel;

@Repository
@Transactional
public class DataTreinoDAO {
	@PersistenceContext
	private EntityManager manager;
	
	public void save(DataTreinoModel data) {
		manager.persist(data);
	}
}
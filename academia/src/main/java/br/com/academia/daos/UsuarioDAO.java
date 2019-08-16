package br.com.academia.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.com.academia.models.UsuarioModel;

@Repository
@Transactional
public class UsuarioDAO {
	@PersistenceContext
	private EntityManager manager;
	
	public void save(UsuarioModel usuario) {
		manager.persist(usuario);
	}
}
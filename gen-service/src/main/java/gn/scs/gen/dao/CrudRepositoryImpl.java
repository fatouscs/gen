package gn.scs.gen.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author X120079
 *
 */
@Transactional
@Component
public class CrudRepositoryImpl<T> implements CrudRepository<T> {

	/** Gestionnaire d entites du domaine sur le contexte internationnal. */
	@PersistenceContext(unitName="gen")
	private EntityManager em;


	private Class<T> entityClass;


	public T get(Long id) {
		return em.find(entityClass, id);
	}

	public T merge(T t) {
		T newT = null;

		newT = em.merge(t);
		
	    try {
	    	newT = em.merge(t);
	    	em.flush();
	      } catch (PersistenceException ise) {
	      throw new IllegalStateException("Erreur de validation JPA : " + ise.getMessage());
	      }
		return newT;
	}

	public T persist(T t) {
		
	    try {
	    	em.persist(t);
	    	em.flush();
	      } catch (PersistenceException ise) {
	      throw new IllegalStateException("Erreur de validation JPA : " + ise.getMessage());
	      }
		return t;
	}

	public void remove(T t) {
	    try {
	    	em.remove(t);
	    	em.flush();
	      } catch (PersistenceException ise) {
	      throw new IllegalStateException("Erreur de validation JPA : " + ise.getMessage());
	      }
	
		

	}
	
	public void clear() {	
		em.flush();
		
		em.clear();
	}
	

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	/**
	 * @return the entityClass
	 */
	public Class<T> getEntityClass() {
		return entityClass;
	}

	/**
	 * @param entityClass the entityClass to set
	 */
	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	

}

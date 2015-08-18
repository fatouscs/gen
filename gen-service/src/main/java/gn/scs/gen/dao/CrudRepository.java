package gn.scs.gen.dao;

import gn.scs.gen.utils.TechnicalException;

/**
 * @author X120079
 *
 */
public interface CrudRepository<T> {



	  T get(Long id) throws TechnicalException;


	  T merge(T t) throws TechnicalException;


	  T persist(T t) throws TechnicalException;

	  void remove(T t) throws TechnicalException;
	  
	  void clear() throws TechnicalException;
}

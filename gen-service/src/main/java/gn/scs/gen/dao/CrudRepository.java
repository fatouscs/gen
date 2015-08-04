package gn.scs.gen.dao;


/**
 * @author X120079
 *
 */
public interface CrudRepository<T> {



	  T get(Long id);


	  T merge(T t);


	  T persist(T t);

	  void remove(T t);
	  
	  void clear();
}

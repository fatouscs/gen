/**
 * 
 */
package gn.scs.gen.transformer;

/**
 * Interface Mapper
 * Elle permet de transformer les Objets T et R
 * avec les méthodes map et unmap
 * @author fcamara
 *
 */



public interface Mapper<T, R> {

	R map(T type);
	
	T unmap(R result);
	
	
}

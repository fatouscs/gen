/**
 * 
 */
package gn.scs.gen.dao;

import java.util.Properties;

import gn.scs.gen.model.Etudiant;

/**
 * @author Fatou Camara
 *
 */
public class EtudiantDaoImpl  extends CrudRepositoryImpl<Etudiant> implements EtudiantDao {

	
	/** Fichiers de proprietes. */
	public Properties requetes;
	
}

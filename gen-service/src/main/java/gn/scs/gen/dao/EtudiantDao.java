package gn.scs.gen.dao;

import gn.scs.gen.dao.CrudRepository;
import gn.scs.gen.model.Etudiant;

public interface EtudiantDao  extends CrudRepository<Etudiant> {

	/**
	 * Méthode de recherche d'étudiant selon l'email
	 * @param email
	 * Email à rechercher
	 * @return Etudiant à rechercher	 
	 * */
	Etudiant rechercheEtudiantByEmail(String email);
}

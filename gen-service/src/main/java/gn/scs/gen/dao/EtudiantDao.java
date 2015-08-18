package gn.scs.gen.dao;

import gn.scs.gen.dao.CrudRepository;
import gn.scs.gen.model.Etudiant;

public interface EtudiantDao  extends CrudRepository<Etudiant> {

	/**
	 * M�thode de recherche d'�tudiant selon l'email
	 * @param email
	 * Email � rechercher
	 * @return Etudiant � rechercher	 
	 * */
	Etudiant rechercheEtudiantByEmail(String email);
}

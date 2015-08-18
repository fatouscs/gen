package gn.scs.gen.service.etudiant;

import gn.scs.gen.dto.etudiant.EtudiantDTO;
/**
 * Service M�tier de recherche d'�tudiant.
 * 
 * @author fcamara
 *
 */
public interface RechercheEtudiantSM {

	/**
	 * M�thode de recherche d'�tudiant par Email	
	 * @param email
	 * Email de l'etudiant
	 * @return Etudiant trouv�
	 */
	EtudiantDTO rechercheEtudiantByEmail(String email);
	
	
	/**
	 * M�thode de recherche d'�tudiant par Matricule	
	 * @param matricule
	 * Matricule de l'etudiant
	 * @return Etudiant trouv�
	 */
	EtudiantDTO rechercheEtudiantByMatricule(String matricule);
	
	
}

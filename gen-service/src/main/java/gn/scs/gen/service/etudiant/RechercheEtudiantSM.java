package gn.scs.gen.service.etudiant;

import gn.scs.gen.dto.etudiant.EtudiantDTO;
/**
 * Service Métier de recherche d'étudiant.
 * 
 * @author fcamara
 *
 */
public interface RechercheEtudiantSM {

	/**
	 * Méthode de recherche d'étudiant par Email	
	 * @param email
	 * Email de l'etudiant
	 * @return Etudiant trouvé
	 */
	EtudiantDTO rechercheEtudiantByEmail(String email);
	
	
	/**
	 * Méthode de recherche d'étudiant par Matricule	
	 * @param matricule
	 * Matricule de l'etudiant
	 * @return Etudiant trouvé
	 */
	EtudiantDTO rechercheEtudiantByMatricule(String matricule);
	
	
}

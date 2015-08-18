/**
 * 
 */
package gn.scs.gen.service.etudiant;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import gn.scs.gen.dto.etudiant.EtudiantDTO;

/**
 * Service Métier de recherche d'étudiant.
 * 
 * @author fcamara
 *
 */
@Transactional
@Component
public class RechercheEtudiantSMImpl implements RechercheEtudiantSM {

	/* (non-Javadoc)
	 * @see gn.scs.gen.service.etudiant.RechercheEtudiantSM#rechercheEtudiantByEmail(java.lang.String)
	 */
	@Override
	public EtudiantDTO rechercheEtudiantByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see gn.scs.gen.service.etudiant.RechercheEtudiantSM#rechercheEtudiantByMatricule(java.lang.String)
	 */
	@Override
	public EtudiantDTO rechercheEtudiantByMatricule(String matricule) {
		// TODO Auto-generated method stub
		return null;
	}

}

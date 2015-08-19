/**
 * 
 */
package gn.scs.gen.impl;

import org.springframework.beans.factory.annotation.Autowired;

import gn.scs.gen.dto.etudiant.AjoutEtudiantReponse;
import gn.scs.gen.dto.etudiant.EtudiantDTO;
import gn.scs.gen.dto.etudiant.InscriptionDTO;
import gn.scs.gen.service.etudiant.AjoutEtudiantSM;
import gn.scs.gen.utils.TechnicalException;

/**
 * @author Fatou Camara
 *
 */
public class EtudiantServiceImpl implements EtudiantService {
	
	@Autowired
	private AjoutEtudiantSM ajoutEtudiantSM;
	/**
	 * Méthode d'ajout d'un nouvel étudiant
	 * @param request
	 * 	Informations de l'étudiant
	 * @return Etudiant crée
	 * @throws TechnicalException 
	 */
	@Override
	public AjoutEtudiantReponse ajoutEtudiant(EtudiantDTO request) throws TechnicalException {
		// TODO Auto-generated method stub
		return ajoutEtudiantSM.ajoutEtudiant(request);
	}

	/**
	 * 
	 * Méthode d'ajout d'un nouvel étudiant suite à une inscription
	 * @param request
	 * 	Informations de l'étudiant
	 * @param demande
	 * 	Demande d'inscriptipon
	 * @return Etudiant crée
	 * @throws TechnicalException 
	 */
	@Override
	public AjoutEtudiantReponse inscriptionEtudiant(InscriptionDTO demande) throws TechnicalException {
		// TODO Auto-generated method stub
		return ajoutEtudiantSM.inscriptionEtudiant(demande);
	}
	


}

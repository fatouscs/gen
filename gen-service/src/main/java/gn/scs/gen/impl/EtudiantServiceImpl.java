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
	 * M�thode d'ajout d'un nouvel �tudiant
	 * @param request
	 * 	Informations de l'�tudiant
	 * @return Etudiant cr�e
	 * @throws TechnicalException 
	 */
	@Override
	public AjoutEtudiantReponse ajoutEtudiant(EtudiantDTO request) throws TechnicalException {
		// TODO Auto-generated method stub
		return ajoutEtudiantSM.ajoutEtudiant(request);
	}

	/**
	 * 
	 * M�thode d'ajout d'un nouvel �tudiant suite � une inscription
	 * @param request
	 * 	Informations de l'�tudiant
	 * @param demande
	 * 	Demande d'inscriptipon
	 * @return Etudiant cr�e
	 * @throws TechnicalException 
	 */
	@Override
	public AjoutEtudiantReponse inscriptionEtudiant(InscriptionDTO demande) throws TechnicalException {
		// TODO Auto-generated method stub
		return ajoutEtudiantSM.inscriptionEtudiant(demande);
	}
	


}

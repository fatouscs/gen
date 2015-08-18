package gn.scs.gen.service.etudiant;

import gn.scs.gen.dto.etudiant.AjoutEtudiantReponse;
import gn.scs.gen.dto.etudiant.EtudiantDTO;
import gn.scs.gen.dto.etudiant.InscriptionDTO;
import gn.scs.gen.utils.TechnicalException;

public interface AjoutEtudiantSM {
	AjoutEtudiantReponse ajoutEtudiant(EtudiantDTO request) throws TechnicalException;

	AjoutEtudiantReponse inscriptionEtudiant(InscriptionDTO demande) throws TechnicalException;

	

}

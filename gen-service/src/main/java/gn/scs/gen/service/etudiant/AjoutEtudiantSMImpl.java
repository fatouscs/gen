package gn.scs.gen.service.etudiant;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import gn.scs.gen.dao.EtudiantDao;
import gn.scs.gen.dto.commun.CodeRetourDTO;
import gn.scs.gen.dto.etudiant.AjoutEtudiantReponse;
import gn.scs.gen.dto.etudiant.EtudiantDTO;
import gn.scs.gen.dto.etudiant.InscriptionDTO;
import gn.scs.gen.model.Etudiant;
import gn.scs.gen.transformer.EtudiantMapper;
import gn.scs.gen.utils.TechnicalException;
/**
 * Service m�tier d'ajout d'Etudiant
 * @author fcamara
 *
 */
@Transactional
@Component
public class AjoutEtudiantSMImpl implements AjoutEtudiantSM {

	private EtudiantMapper etudiantTransformer;
	private RechercheEtudiantSM rechercheEtudiant;
	private EtudiantDao etudiantDao;

	@Override
	public AjoutEtudiantReponse ajoutEtudiant(EtudiantDTO request) throws TechnicalException {
		AjoutEtudiantReponse response =new AjoutEtudiantReponse();
		CodeRetourDTO retour=null;
		//V�rification de l'existence de l'email dans le r�f�rentiel
		EtudiantDTO etudiant = rechercheEtudiant.rechercheEtudiantByEmail(request.getEmail());

		if(etudiant == null){
			Etudiant studentToCreate=etudiantTransformer.unmap(request);
			//Cr�ation de l'�tudiant en base
			Etudiant studentCreated=etudiantDao.persist(studentToCreate);

			//Transaformation de studentCreated=>etudiant
			etudiant=	etudiantTransformer.map(studentCreated);
			retour=new CodeRetourDTO("000","Operation reussie");
		}else{
			retour=new CodeRetourDTO("000","Email d�j� pr�sente en base");
		}
		//Alimentation du retour
		response.setEtudiant(etudiant);
		response.setRetour(retour);

		return response;
	}

	@Override
	public AjoutEtudiantReponse inscriptionEtudiant(InscriptionDTO demande) throws TechnicalException {
		AjoutEtudiantReponse response =new AjoutEtudiantReponse();
		CodeRetourDTO retour=null;
		//V�rification de l'existence de l'email dans le r�f�rentiel
		EtudiantDTO etudiant = rechercheEtudiant.rechercheEtudiantByEmail(demande.getEmail());

		if(etudiant == null){
			//R�cup�ration de l'inscription
			
			
			
			Etudiant studentToCreate=etudiantTransformer.unmap(demande);
			//Cr�ation de l'�tudiant en base
			Etudiant studentCreated=etudiantDao.persist(studentToCreate);

			//Transaformation de studentCreated=>etudiant
			etudiant=	etudiantTransformer.map(studentCreated);
			retour=new CodeRetourDTO("000","Operation reussie");
		}else{
			retour=new CodeRetourDTO("000","Email d�j� pr�sente en base");
		}
		//Alimentation du retour
		response.setEtudiant(etudiant);
		response.setRetour(retour);

		return response;
	}

}

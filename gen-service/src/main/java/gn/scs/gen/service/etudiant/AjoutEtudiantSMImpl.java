package gn.scs.gen.service.etudiant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import gn.scs.gen.dao.EtudiantDao;
import gn.scs.gen.dto.commun.CodeRetourDTO;
import gn.scs.gen.dto.commun.ServiceReference;
import gn.scs.gen.dto.etudiant.AjoutEtudiantReponse;
import gn.scs.gen.dto.etudiant.EtudiantDTO;
import gn.scs.gen.dto.etudiant.InscriptionDTO;
import gn.scs.gen.model.Etudiant;
import gn.scs.gen.transformer.EtudiantMapper;
import gn.scs.gen.utils.TechnicalException;
/**
 * Service métier d'ajout d'Etudiant
 * @author fcamara
 *
 */
@Transactional
@Component
public class AjoutEtudiantSMImpl implements AjoutEtudiantSM {
	
	
	@Autowired
	private RechercheEtudiantSM rechercheEtudiant;
		
	@Autowired
	private EtudiantDao etudiantDao;

	@Override
	public AjoutEtudiantReponse ajoutEtudiant(EtudiantDTO request) throws TechnicalException {
		AjoutEtudiantReponse response =new AjoutEtudiantReponse();
		 EtudiantMapper etudiantTransformer=new EtudiantMapper();
		CodeRetourDTO retour=null;
		EtudiantDTO etudiantCree=null;
		//Vérification de l'existence de l'email dans le référentiel
		Etudiant etudiant = etudiantDao.rechercheEtudiantByEmail(request.getEmail());

		if(etudiant == null){
			Etudiant studentToCreate=etudiantTransformer.unmap(request);
			//Création de l'étudiant en base
			Etudiant studentCreated=etudiantDao.persist(studentToCreate);

			//Transformation de studentCreated=>etudiant
			etudiantCree=	etudiantTransformer.map(studentCreated);
			retour=new CodeRetourDTO("000","Operation reussie");
		}else{
			retour=new CodeRetourDTO("000","Email déjà présente en base");
		}
		//Alimentation du retour
		response.setEtudiant(etudiantCree);
		response.setRetour(retour);

		return response;
	}

	@Override
	public AjoutEtudiantReponse inscriptionEtudiant(InscriptionDTO demande) throws TechnicalException {
		AjoutEtudiantReponse response =new AjoutEtudiantReponse();
		EtudiantMapper etudiantTransformer=new EtudiantMapper();
		CodeRetourDTO retour=null;
		//Vérification de l'existence de l'email dans le référentiel
		EtudiantDTO etudiant = rechercheEtudiant.rechercheEtudiantByEmail(demande.getEmail());

		if(etudiant == null){
			//Récupération de l'inscription
			
			
			
			Etudiant studentToCreate=etudiantTransformer.unmap(demande);
			//Création de l'étudiant en base
			Etudiant studentCreated=etudiantDao.persist(studentToCreate);

			//Transaformation de studentCreated=>etudiant
			etudiant=	etudiantTransformer.map(studentCreated);
			retour=new CodeRetourDTO("000","Operation reussie");
		}else{
			retour=new CodeRetourDTO("000","Email déjà présente en base");
		}
		//Alimentation du retour
		response.setEtudiant(etudiant);
		response.setRetour(retour);

		return response;
	}

}

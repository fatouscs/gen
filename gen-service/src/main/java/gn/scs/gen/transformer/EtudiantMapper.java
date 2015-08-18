/**
 * 
 */
package gn.scs.gen.transformer;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import gn.scs.gen.dto.etudiant.EtudiantDTO;
import gn.scs.gen.dto.etudiant.InscriptionDTO;
import gn.scs.gen.model.Etudiant;

/**
 * Classe de transformation d'un etudiant en etudiantDTO.
 * Et inversement.
 * @author fcamara
 *
 */
@Transactional
@Component
public class EtudiantMapper implements Mapper<Etudiant,EtudiantDTO>{

	@Override
	public EtudiantDTO map(Etudiant etudiant) {
		EtudiantDTO etudiantDTO=null;

		if(etudiant!=null){
			etudiantDTO=new EtudiantDTO();

			if(etudiant.getIdEtudiant()!=null){
				etudiantDTO.setIdEtudiant(etudiant.getIdEtudiant());
			}

			etudiantDTO.setEmail(etudiant.getEmail());

			etudiantDTO.setMatricule(etudiant.getMatricule());
			etudiantDTO.setNom(etudiant.getNom());
			etudiantDTO.setPrenom(etudiant.getPrenom());
			etudiantDTO.setSexe(etudiant.getSexe());
			etudiantDTO.setSituationMatrimoniale(etudiant.getSituationMatrimoniale());
			etudiantDTO.setNationalite(etudiant.getNationalite());
			etudiantDTO.setAdresse(etudiant.getAdresse());
			etudiantDTO.setTelephone(etudiant.getTelephone());
			etudiantDTO.setTelephoneTuteur(etudiant.getTelephoneTuteur());
			etudiantDTO.setTuteur(etudiant.getTuteur());
		}

		return etudiantDTO;
	}

	@Override
	public Etudiant unmap(EtudiantDTO etudiantDTO) {
		Etudiant etudiant=null;

		if(etudiantDTO!=null){
			etudiant=new Etudiant();

			if(etudiantDTO.getIdEtudiant()!=null){
				etudiant.setIdEtudiant(etudiantDTO.getIdEtudiant());
			}

			etudiant.setEmail(etudiantDTO.getEmail());

			etudiant.setMatricule(etudiantDTO.getMatricule());
			etudiant.setNom(etudiantDTO.getNom());
			etudiant.setPrenom(etudiantDTO.getPrenom());
			etudiant.setSexe(etudiantDTO.getSexe());
			etudiant.setSituationMatrimoniale(etudiantDTO.getSituationMatrimoniale());
			etudiant.setNationalite(etudiantDTO.getNationalite());
			etudiant.setAdresse(etudiantDTO.getAdresse());
			etudiant.setTelephone(etudiantDTO.getTelephone());
			etudiant.setTelephoneTuteur(etudiantDTO.getTelephoneTuteur());
			etudiant.setTuteur(etudiantDTO.getTuteur());
		}

		return etudiant;
	}


	public Etudiant unmap(InscriptionDTO result) {
		// TODO Auto-generated method stub
		return null;
	}

}

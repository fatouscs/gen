/**
 * 
 */
package gn.scs.gen.transformer;

import gn.scs.gen.dto.etudiant.EtudiantDTO;
import gn.scs.gen.dto.etudiant.InscriptionDTO;
import gn.scs.gen.model.Etudiant;

/**
 * Classe de transformation d'un etudiant en etudiantDTO.
 * Et inversement.
 * @author fcamara
 *
 */
public class EtudiantMapper implements Mapper<Etudiant,EtudiantDTO>{

	@Override
	public EtudiantDTO map(Etudiant type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant unmap(EtudiantDTO result) {
		// TODO Auto-generated method stub
		return null;
	}


	public Etudiant unmap(InscriptionDTO result) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

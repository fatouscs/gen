/**
 * 
 */
package gn.scs.gen.dto.etudiant;

import gn.scs.gen.dto.commun.CodeRetourDTO;

import java.io.Serializable;

/**
 * @author Fatou Camara
 *
 */
public class AjoutEtudiantReponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7570226173860503970L;
	
	private EtudiantDTO etudiant;
	private CodeRetourDTO retour;
	/**
	 * @return the etudiant
	 */
	public EtudiantDTO getEtudiant() {
		return etudiant;
	}
	/**
	 * @param etudiant the etudiant to set
	 */
	public void setEtudiant(EtudiantDTO etudiant) {
		this.etudiant = etudiant;
	}
	/**
	 * @return the retour
	 */
	public CodeRetourDTO getRetour() {
		return retour;
	}
	/**
	 * @param retour the retour to set
	 */
	public void setRetour(CodeRetourDTO retour) {
		this.retour = retour;
	}
	
	
}

/**
 * 
 */
package gn.scs.gen.dto.etudiant;

import java.io.Serializable;

/**
 * @author Fatou Camara
 *
 */
public class AjoutEtudiantRequete implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 513517878402988192L;

	private EtudiantDTO etudiant;

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
	
	
}

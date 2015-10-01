package gn.scs.gen.dto.faculte;

import gn.scs.gen.dto.commun.CodeRetourDTO;

import java.io.Serializable;

public class AjoutFaculteReponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4937483251618348860L;
	
	private FaculteDTO faculte;
	private CodeRetourDTO retour;
	
	
	public FaculteDTO getFaculte() {
		return faculte;
	}
	
	public void setFaculte(FaculteDTO faculte) {
		this.faculte = faculte;
	}
	
	public CodeRetourDTO getRetour() {
		return retour;
	}
	
	public void setRetour(CodeRetourDTO retour) {
		this.retour = retour;
	}
	
	
	

}

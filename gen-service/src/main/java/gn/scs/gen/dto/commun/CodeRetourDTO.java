package gn.scs.gen.dto.commun;

import java.io.Serializable;

public class CodeRetourDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8720353496900873800L;

	private String code;
	
	private String libelle;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}

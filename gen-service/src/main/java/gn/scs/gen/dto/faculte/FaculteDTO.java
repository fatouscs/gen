package gn.scs.gen.dto.faculte;

import java.io.Serializable;

public class FaculteDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6520749570982488134L;
	
	private long idFaculte;
	private String libelle;
	
	public long getIdFaculte(){
		return this.idFaculte;	
	}
	public void setIdfaculte(long idFaculte){
		this.idFaculte=idFaculte;
	}
	
	public String getLibelle(){
		return this.libelle;
	}
	public void setLibelle(String libelle){
		this.libelle=libelle;
	}
	

}
